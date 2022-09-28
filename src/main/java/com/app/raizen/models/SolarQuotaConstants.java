package com.app.raizen.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "solarQuotaConstants", schema = "public")
public class SolarQuotaConstants {
	
	@Id
	private int sq_id = 1;
	
	@Column(name="monetary_value")
	private double monetary_value = 248.16;
	
	@Column(name="kwh")
	private double kwh = 50;//how much kwh equals one solar quota

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

}
