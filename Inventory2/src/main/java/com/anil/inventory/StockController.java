package com.anil.inventory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anil.inventory.model.CostCentre;
import com.anil.inventory.model.Item;
import com.anil.inventory.model.Stock;
import com.anil.inventory.services.StockServiceImpl;

@RestController
public class StockController {

	@Autowired
	private StockServiceImpl stockServiceImpl;

	@GetMapping("/getStock")
	public List<Stock> getStock() {
		return stockServiceImpl.findAll();
	}

	@PostMapping("/addStock")
	public Stock addStock(@RequestBody Stock stock) {
		Stock s = new Stock(stock.getId(), stock.getClosingStock(), stock.getOpeningStock());
		Item item = new Item(stock.getItem());
		s.setItem(item);
		CostCentre cc = new CostCentre(stock.getCostcentre());
		s.setCostcentre(cc);
		return stockServiceImpl.save(s);
	}

	@PutMapping("/updateStock/{id}")
	public Stock updateStock(@PathVariable("id") Long id, @RequestBody Stock stock) {
		Stock s = new Stock(id, stock.getClosingStock(), stock.getOpeningStock());
		Item item = new Item(id);
		s.setItem(item);
		CostCentre cc = new CostCentre(stock.getCostcentre());
		s.setCostcentre(cc);
		return stockServiceImpl.save(s);
	}

	@DeleteMapping("/deleteStock/{id}")
	public void deleteStock(@PathVariable("id") Long id) {
		stockServiceImpl.deleteById(id);
	}
}
