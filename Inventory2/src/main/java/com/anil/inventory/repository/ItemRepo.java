package com.anil.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anil.inventory.model.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item, Long>{

	Item findById(String id);

	
}
