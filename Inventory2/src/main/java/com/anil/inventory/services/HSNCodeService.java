package com.anil.inventory.services;

import java.util.List;

import com.anil.inventory.model.HSNCode;

public interface HSNCodeService {
	
	public List<HSNCode> findAll();
	HSNCode findByCode(String code);	
	public HSNCode save(HSNCode h);
	HSNCode deleteByID(Long id);
}
