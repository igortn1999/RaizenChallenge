package com.app.raizen.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.raizen.repositories.AddressRepository;

public class DeviceDto {
	
	private int id;
	private String name;
	private double consumption;
	private int address_id;
	private Date last_maintenance;
	
	@Autowired
	AddressRepository ar;
	
	public DeviceDto() {
	//TODO discover which builder is necessary
	}

	public DeviceDto(int id, String name, double consumption, int address_id, Date last_maintenance) {
		//TODO discover which builder is necessary
		this.id = id;
		this.name = name;
		this.consumption = consumption;
		this.address_id = address_id;
		this.last_maintenance = last_maintenance;
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

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public Date getLast_maintenance() {
		return last_maintenance;
	}

	public void setLast_maintenance(Date last_maintenance) {
		this.last_maintenance = last_maintenance;
	}
	
}
