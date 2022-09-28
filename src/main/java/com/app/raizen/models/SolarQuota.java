package com.app.raizen.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "SolarQuotas", schema = "public")
public class SolarQuota {
	
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	@NotNull
	private User user;//TODO change to OneToOne
	
	@Column(name = "quantity")
	private int quantity;//how many solar quotas are being buyed
	
	@Column(name = "customer_consumption")
	private double customer_consumption;//kwh
	
	@Column(name = "cost")
	private double cost;//total cost for client 
	
//	@Column(name = "kwh_value")
//	private double kwh_value;
	
	public SolarQuota() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCustomer_consumption() {
		return customer_consumption;
	}

	public void setCustomer_consumption(double customer_consumption) {
		this.customer_consumption = customer_consumption;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
}
