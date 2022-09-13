package com.app.raizen.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "SolarQuotas", schema = "public")
public class SolarQuota {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	@Column(name = "userid")
	private int userid;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "production")
	private String production;//TODO what is this for exactly?
	
	@Column(name = "value")
	private double value;//TODO quantity and value are directly related
	
	public SolarQuota() {
		
	}

	public SolarQuota(@NotNull int userid, int quantity, String production, double value) {
		super();
		this.userid = userid;
		this.quantity = quantity;
		this.production = production;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

}
