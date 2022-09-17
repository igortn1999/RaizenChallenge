package com.app.raizen.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Devices", schema="public")
public class Device {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
//	@NotNull
//	@Column(name = "userid")
//	private int userid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="consumption")
	private double consumption;
	
	@ManyToOne//Java Spring only needs this notation to create a Many To one relationship.
	private Address address;
	
	@Column(name="last_maintenance")
	private Date last_maintenance;//must be carefull with date format

	public Device() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getConsumption() {
		return consumption;
	}

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getLast_maintenance() {
		return last_maintenance;
	}

	public void setLast_maintenance(Date last_maintenance) {
		this.last_maintenance = last_maintenance;
	}
		
}
