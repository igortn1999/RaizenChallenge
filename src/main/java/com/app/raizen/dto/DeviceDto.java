package com.app.raizen.dto;

public class DeviceDto {
	
	private int id;
	private String name;
	
	
	public DeviceDto() {
	//TODO discover is this is necessary	
	}
	
	public DeviceDto(int id, String name) {
		this.id=id;
		this.name=name;
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
	
	
}
