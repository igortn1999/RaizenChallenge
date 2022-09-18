package com.app.raizen.dto;

public class SolarQuotaDto {
	
	private int id;
	private int user_id;
	private int quantity;
	private String production;
	private double value;
	
	public SolarQuotaDto() {
		
	}

	public SolarQuotaDto(int id, int user_id, int quantity, String production, double value) {
		this.id = id;
		this.user_id = user_id;
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

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
