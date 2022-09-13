package com.app.raizen.dto;

public class SolarQuotaDto {
	
	private int id;
	private int userid;
	private int quantity;
	private String production;
	private double value;
	
	public SolarQuotaDto() {
		
	}

	public SolarQuotaDto(int id, int userid, int quantity, String production, double value) {
		super();
		this.id = id;
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
