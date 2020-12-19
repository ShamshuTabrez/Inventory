package com.anil.inventory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@OneToOne
	public HSNCode hsn;

	public HSNCode getHsn() {
		return hsn;
	}

	public void setHsn(HSNCode hsn) {
		this.hsn = hsn;
	}
	
	public Item() {
		
	}

	public Item(Item item) {
		this.id=item.getId();
		this.name=item.getName();
		this.hsn=item.getHsn();
	}
	public Item(Long id, String name) {
		this.id=id;
		this.name=name;
	}	

	public Item(Long id2) {
		this.id=id2;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
