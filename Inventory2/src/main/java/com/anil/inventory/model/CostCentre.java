package com.anil.inventory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CostCentre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String Organization;

	public CostCentre() {
	}

	public CostCentre(Long id, String name, String organization) {
		this.id = id;
		this.name = name;
		this.Organization = organization;
	}

	public CostCentre(CostCentre costcentre) {
		this.id=costcentre.getId();
		this.name=costcentre.getName();
		this.Organization=costcentre.getOrganization();
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

	public String getOrganization() {
		return Organization;
	}

	public void setOrganization(String organization) {
		Organization = organization;
	}

}
