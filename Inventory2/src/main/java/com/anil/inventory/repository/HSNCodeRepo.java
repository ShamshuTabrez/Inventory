package com.anil.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anil.inventory.model.HSNCode;

@Repository
public interface HSNCodeRepo extends JpaRepository<HSNCode, Long>{

	HSNCode findByCode(String code);
	
}
