package com.anil.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anil.inventory.model.Cost;

@Repository
public interface CostRepo extends JpaRepository<Cost, Long>{

}
