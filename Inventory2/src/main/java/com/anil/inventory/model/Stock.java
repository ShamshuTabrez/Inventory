package com.anil.inventory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long openingStock;
	private Long closingStock;

	@OneToOne
	private Item item;

	@OneToOne
	private CostCentre costcentre;

	public Stock() {
	}

	public Stock(Long id, Long openingStock, Long closingStock, Item item, CostCentre costcentre) {
		this.id = id;
		this.openingStock = openingStock;
		this.closingStock = closingStock;
		this.item = item;
		this.costcentre = costcentre;
	}

	public Stock(Long id2, Long openingStock2, Long closingStock2) {
		this.id = id2;
		this.openingStock = openingStock2;
		this.closingStock = closingStock2;
	}

	public void Stock1(Stock stock1) {
		this.id = stock1.getId();
		this.openingStock = stock1.getClosingStock();
		this.closingStock = stock1.getOpeningStock();
	}

	public Stock(Stock stock) {

		this.id = stock.getId();
		this.openingStock = stock.getOpeningStock();
		this.closingStock = stock.getClosingStock();
		this.item = stock.getItem();
		this.costcentre = stock.getCostcentre();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOpeningStock() {
		return openingStock;
	}

	public void setOpeningStock(Long openingStock) {
		this.openingStock = openingStock;
	}

	public Long getClosingStock() {
		return closingStock;
	}

	public void setClosingStock(Long closingStock) {
		this.closingStock = closingStock;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public CostCentre getCostcentre() {
		return costcentre;
	}

	public void setCostcentre(CostCentre costcentre) {
		this.costcentre = costcentre;
	}

}
