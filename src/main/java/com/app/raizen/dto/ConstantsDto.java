package com.app.raizen.dto;

public class ConstantsDto {
	
	private int sq_id;
	private double kwh;
	private double monetary_value;
	private int user_id;
	
	public ConstantsDto(double kwh, double monetary_value) {
		this.kwh=kwh;
		this.monetary_value=monetary_value;
	}
	
	public ConstantsDto(int user_id) {
		this.user_id=user_id;
	}

	public int getSq_id() {
		return sq_id;
	}

	public void setSq_id(int sq_id) {
		this.sq_id = sq_id;
	}

	public double getMonetary_value() {
		return monetary_value;
	}

	public void setMonetary_value(double monetary_value) {
		this.monetary_value = monetary_value;
	}

	public double getKwh() {
		return kwh;
	}

	public void setKwh(double kwh) {
		this.kwh = kwh;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
}
