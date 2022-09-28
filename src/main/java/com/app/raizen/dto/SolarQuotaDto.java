package com.app.raizen.dto;

public class SolarQuotaDto {
	
	private int id;
	private int user_id;
//	private int quantity;
	private double customer_consumption;//kwh
//	private double cost;
	
	public SolarQuotaDto() {
		
	}

//	public SolarQuotaDto(int id, int user_id, int quantity, double customer_consumption, double cost) {
//		this.id = id;
//		this.user_id = user_id;
//		this.quantity = quantity;
//		this.customer_consumption = customer_consumption;
//		this.cost= cost;
//	}
	
	public SolarQuotaDto(int id, int user_id, double customer_consuption) {
		this.id=id;
		this.user_id=user_id;
		this.customer_consumption = customer_consuption;
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

	public double getCustomer_consumption() {
		return customer_consumption;
	}

	public void setCustomer_consumption(double customer_consumption) {
		this.customer_consumption = customer_consumption;
	}

}
