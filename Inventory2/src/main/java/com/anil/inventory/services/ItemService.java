package com.anil.inventory.services;

import java.util.List;

import com.anil.inventory.model.Item;

public interface ItemService {
	
	public List<Item> findAll();
	public Item save(Item item);
//	public Item findByID(String id);
}
