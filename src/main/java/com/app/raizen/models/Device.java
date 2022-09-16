package com.app.raizen.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@ManyToOne
	private Address address;
	
	@Column(name="lastMaintenance")
	private Date lastMaintenane;

	public Device() {
		
	}
	
	public Device(String name, double consumption, Address address, Date lastMaintenane) {
		this.name=name;
		this.consumption=consumption;
		this.address = address;
		this.lastMaintenane = lastMaintenane;
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

	public Date getLastMaintenane() {
		return lastMaintenane;
	}

	public void setLastMaintenane(Date lastMaintenane) {
		this.lastMaintenane = lastMaintenane;
	}
		
}
