package com.anil.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.anil.inventory.model.CostCentre;
import com.anil.inventory.repository.CostCentreRepo;

@Service
public class CostCentreServiceImpl implements CostCentreService {

	@Autowired
	private CostCentreRepo costcentreRepo;

	@Override
	public List<CostCentre> findAll() {

		return costcentreRepo.findAll();
	}

	@Override
	public CostCentre save(CostCentre costcentre) {
		return costcentreRepo.save(costcentre);
	}

	@Override
	public CostCentre findByID(String id) {
		return findByID(id);
	}
	

	@Query
	public CostCentre findById(String costcentre) {
		return costcentreRepo.findById(costcentre);
	}

	public void deleteById(Long id) {
		costcentreRepo.deleteById(id);
	}

	
	
}
