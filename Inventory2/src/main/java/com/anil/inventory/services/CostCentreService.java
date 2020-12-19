package com.anil.inventory.services;

import java.util.List;

import com.anil.inventory.model.CostCentre;

public interface CostCentreService {

	public List<CostCentre> findAll();
	public CostCentre save(CostCentre costcentre);
	public CostCentre findByID(String id);
}
