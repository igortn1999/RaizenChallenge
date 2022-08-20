package com.app.raizen.dto;

public class DeviceDto {
	
	private int id;
	private String name;
	private double consumption;
	
	
	public DeviceDto() {
	//TODO discover if this is necessary	
	}
	
	public DeviceDto(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public DeviceDto(int id, String name, double consumption) {
		this.id=id;
		this.name=name;
		this.consumption=consumption;
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
	
	
	
	
}
