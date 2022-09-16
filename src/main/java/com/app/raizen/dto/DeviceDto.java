package com.app.raizen.dto;

import java.util.Date;

import org.springframework.format.datetime.DateFormatter;

import com.app.raizen.models.Address;

public class DeviceDto {
	
	private int id;
	private String name;
	private double consumption;
	private int addressID;
	private Date lastMaintenane;
	
	public DeviceDto() {
	//TODO discover if this is necessary
	}

	public DeviceDto(int id, String name, double consumption, int addressID, Date lastMaintenane) {
		this.id = id;
		this.name = name;
		this.consumption = consumption;
		this.addressID=addressID;
		this.lastMaintenane = lastMaintenane;
	}
//	public DeviceDto(int id, String name, double consumption) {
//		this(id, name, consumption, null ,new Date());
//	}

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

	public int getAddressID() {
		return addressID;
	}

	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}

	public Date getLastMaintenane() {
		return lastMaintenane;
	}

	public void setLastMaintenane(Date lastMaintenane) {
		this.lastMaintenane = lastMaintenane;
	}	
	
}
