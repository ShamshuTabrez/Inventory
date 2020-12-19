package com.anil.inventory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cost {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long Rate;
	
	@OneToOne
	private Item item;
	

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	
	public Cost() {
	}

	public Cost(Long id, Long rate, Item item) {
		super();
		this.id = id;
		this.Rate = rate;
		this.item = item;
	}

	public Cost(Long id2, Long rate2) {
	this.id=id2;
	this.Rate=rate2;
	}
	
	
	public Cost(Cost cost) {
		this.id = cost.getId();
		this.Rate = cost.getRate();
		this.item = cost.getItem();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRate() {
		return Rate;
	}

	public void setRate(Long rate) {
	this.Rate = rate;
	}

	

}
