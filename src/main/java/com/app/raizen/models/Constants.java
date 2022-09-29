package com.app.raizen.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "constants", schema = "public")
public class Constants {
	
	@Id
	private int const_id = 1;
	
	@Column(name="sq_monetary_value")
	private double sq_monetary_value = 0.85;
	
	@Column(name="sq_kwh")
	private double sq_kwh = 1;//how much kwh equals one solar quota
	
	@Column(name="curr_userid")
	private int user_id;

	public int getConst_id() {
		return const_id;
	}

	public void setConst_id(int const_id) {
		this.const_id = const_id;
	}

	public double getSq_monetary_value() {
		return sq_monetary_value;
	}

	public void setSq_monetary_value(double sq_monetary_value) {
		this.sq_monetary_value = sq_monetary_value;
	}

	public double getSq_kwh() {
		return sq_kwh;
	}

	public void setSq_kwh(double sq_kwh) {
		this.sq_kwh = sq_kwh;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
}
