package com.anil.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.inventory.model.Stock;
import com.anil.inventory.repository.StockRepo;

@Service
public class StockServiceImpl implements StockService{

	@Autowired
	private StockRepo stockRepo;

	@Override
	public List<Stock> findAll() {
		return stockRepo.findAll();
	}

	@Override
	public Stock save(Stock stock) {
		return stockRepo.save(stock);
	}

	public void deleteById(Long id) {
		stockRepo.deleteById(id);
		
	}
	
	
}

