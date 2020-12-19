package com.anil.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.inventory.model.Cost;
import com.anil.inventory.repository.CostRepo;

@Service
public class CostServiceImpl implements CostService {

	@Autowired
	private CostRepo costRepo;

	@Override
	public List<Cost> findAll() {

		return costRepo.findAll();
	}

	@Override
	public Cost save(Cost cost) {
		return costRepo.save(cost);
	}

	public void deleteById(Long id) {
	costRepo.deleteById(id);
		
	}

}
