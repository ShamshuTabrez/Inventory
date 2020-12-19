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

import com.anil.inventory.model.HSNCode;
import com.anil.inventory.services.HSNCodeServiceImpl;

@RestController
public class HSNCodeController {

	@Autowired
	HSNCodeServiceImpl hsncodeServiceImpl;
	
	
	@GetMapping("/getHSNCode")
	public List<HSNCode> gethsnCode() {
		return hsncodeServiceImpl.findAll();
		
	}
	
	@PostMapping("/postHSNCode")
	public HSNCode addhsncode(@RequestBody HSNCode hsncode) {
		HSNCode h = new HSNCode(hsncode.getId(), hsncode.getCode());
		return hsncodeServiceImpl.save(h);
	}
	
	@PutMapping("/updateHSNCode/{id}")
	public HSNCode updateHSNCode(@PathVariable ("id") Long id, @RequestBody HSNCode hsncode) {
		HSNCode h = new HSNCode(id, hsncode.getCode());
		return hsncodeServiceImpl.save(h);
	}
	
	@DeleteMapping("/deleteHSNCode/{id}")
	public void deleteHSNCode(@PathVariable("id") Long id) {
		hsncodeServiceImpl.deleteByID(id);
		
	}
	
}
