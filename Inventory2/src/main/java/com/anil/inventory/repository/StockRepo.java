package com.anil.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anil.inventory.model.Stock;

@Repository
public interface StockRepo extends JpaRepository<Stock, Long>{

}
