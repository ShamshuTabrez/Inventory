package com.anil.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.inventory.model.HSNCode;
import com.anil.inventory.repository.HSNCodeRepo;

@Service
public class HSNCodeServiceImpl implements HSNCodeService {

	@Autowired
	private HSNCodeRepo hsncodeRepo;

	@Override
	public List<HSNCode> findAll() {
		return hsncodeRepo.findAll();
	}

	@Override
	public HSNCode save(HSNCode h) {
		return hsncodeRepo.save(h);
	}

	@Override
	public HSNCode findByCode(String code) {
		return hsncodeRepo.findByCode(code);
	}

	@Override
	public HSNCode deleteByID(Long id) {
		 hsncodeRepo.deleteById(id);
		 return null;
	}


}
