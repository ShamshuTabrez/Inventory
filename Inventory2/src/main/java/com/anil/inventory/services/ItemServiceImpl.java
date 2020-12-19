package com.anil.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.anil.inventory.model.Item;
import com.anil.inventory.repository.ItemRepo;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepo itemRepo;
	
	@Override
	public List<Item> findAll() {
		return itemRepo.findAll();
	}

	@Override
	public Item save(Item item) {
		return itemRepo.save(item);
	}

	@Query
	public Item findById(String id) {
		return itemRepo.findById(id);
	}

	public void deleteById(Long id) {
		itemRepo.deleteById(id);
		
	}

	public Item findByID(String string) {
		return itemRepo.findById(string);
	}
	
}