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

import com.anil.inventory.model.HSNCode;
import com.anil.inventory.model.Item;
import com.anil.inventory.services.CostServiceImpl;
import com.anil.inventory.services.HSNCodeServiceImpl;
import com.anil.inventory.services.ItemServiceImpl;
import com.anil.inventory.services.StockServiceImpl;

@RestController
public class ItemController {

	@Autowired
	private ItemServiceImpl itemServiceImpl;

	@Autowired
	private StockServiceImpl stockServiceImpl;
	@Autowired
	private CostServiceImpl costServiceImpl;

	@Autowired
	private HSNCodeServiceImpl hsncodeServiceImpl;

	@GetMapping("/getItems")
	public List<Item> getItems() {
		return itemServiceImpl.findAll();
	}

	@PostMapping("/addItems")
	public Item additem(@RequestBody Item i) {
		Item item = new Item(i.getId(), i.getName());
		HSNCode hsncode = hsncodeServiceImpl.findByCode(i.getHsn().getCode().toString());
		item.setHsn(hsncode);
		return itemServiceImpl.save(item);
	}

	@PutMapping("/updateItem/{id}")
	public Item updateItem(@PathVariable("id") Long id, @RequestBody Item item) {
		Item i = new Item(id, item.getName());
		HSNCode h = hsncodeServiceImpl.findByCode(item.getHsn().getCode().toString());
		i.setHsn(h);
		return itemServiceImpl.save(i);
	}

	@DeleteMapping("/deleteItem/{id}")
	public void deleteItem(@PathVariable("id") Long id) {
		costServiceImpl.deleteById(id);
		stockServiceImpl.deleteById(id);
		itemServiceImpl.deleteById(id);
	}

}
