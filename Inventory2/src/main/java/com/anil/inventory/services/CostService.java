package com.anil.inventory.services;

import java.util.List;

import com.anil.inventory.model.Cost;

public interface CostService {
	
	public List<Cost> findAll();
	public Cost save(Cost cost);
}
