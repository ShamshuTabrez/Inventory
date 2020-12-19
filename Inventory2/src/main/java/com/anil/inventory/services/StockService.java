package com.anil.inventory.services;

import java.util.List;

import com.anil.inventory.model.Stock;

public interface StockService {
	
	public List<Stock> findAll();
	public Stock save(Stock stock);
	
}
