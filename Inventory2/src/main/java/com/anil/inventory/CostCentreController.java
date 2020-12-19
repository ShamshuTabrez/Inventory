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

import com.anil.inventory.model.CostCentre;
import com.anil.inventory.services.CostCentreServiceImpl;
import com.anil.inventory.services.StockServiceImpl;

@RestController
public class CostCentreController {

	@Autowired
	private StockServiceImpl stockserviceImpl;
	
	@Autowired
	private CostCentreServiceImpl costcentreServiceImpl;
	
	@GetMapping("/getCostcentre")
	public List<CostCentre> getCostCentre() {
		return costcentreServiceImpl.findAll();
	}
	
	@PostMapping("/addCostCentre")
	public CostCentre addCostCentre(@RequestBody CostCentre costcentre) {
		CostCentre cc = new CostCentre(costcentre.getId(), costcentre.getName(), costcentre.getOrganization());
		return costcentreServiceImpl.save(cc);
		
	}
	
	@PutMapping("/updateCostCentre/{id}")
	public CostCentre updateCostCentre(@PathVariable("id") Long id, @RequestBody CostCentre costcentre) {
		CostCentre cc = new CostCentre(id,costcentre.getName(),costcentre.getOrganization());
		return costcentreServiceImpl.save(cc);	
	}
	
	@DeleteMapping("/deleteCostCentre/{id}")
	public void deleteCostCentre(@PathVariable("id") Long id) {
		stockserviceImpl.deleteById(id);
		costcentreServiceImpl.deleteById(id);
	}
	
}
