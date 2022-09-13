package com.app.raizen.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(name = "addressid")
	private int addressId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="last_maintenance")
	private Date lastMaintenane;
	
	@Column(name="consumption")
	private double consumption;

	public Device() {
		
	}
	
	public Device(String name) {
		this.name=name;
		this.consumption=0;
	}
	
	public Device(String name, double consumption) {
		this.name=name;
		this.consumption=consumption;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
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
	
}
