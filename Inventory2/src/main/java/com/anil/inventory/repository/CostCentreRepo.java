package com.anil.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anil.inventory.model.CostCentre;

@Repository
public interface CostCentreRepo extends JpaRepository<CostCentre, Long> {

	@Query
	CostCentre findById(String costcentre);
}
