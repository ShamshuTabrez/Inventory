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

import com.anil.inventory.model.Cost;
import com.anil.inventory.model.Item;
import com.anil.inventory.services.CostServiceImpl;

@RestController
public class CostController {

	@Autowired
	private CostServiceImpl costServiceImpl;

	@GetMapping("/getCost")
	public List<Cost> getCost() {
		return costServiceImpl.findAll();
	}

	@PostMapping("/addCost")
	public Cost addCost(@RequestBody Cost cost) {
		Cost c = new Cost(cost.getId(), cost.getRate());
		Item item = new Item(cost.getItem());
		c.setItem(item);
		return costServiceImpl.save(c);
	}

	@PutMapping("/updateCost/{id}")
	public Cost updateCost(@PathVariable("id") Long id, @RequestBody Cost cost) {
		Cost c = new Cost(id, cost.getRate());
		Item item = new Item(id);
		c.setItem(item);
		return costServiceImpl.save(c);
	}

	@DeleteMapping("/deleteCost/{id}")
	public void deleteCost(@PathVariable("id") Long id) {
		costServiceImpl.deleteById(id);
	}

}
