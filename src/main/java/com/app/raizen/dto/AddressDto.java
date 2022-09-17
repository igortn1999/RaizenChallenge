package com.app.raizen.dto;

import java.util.List;

import com.app.raizen.models.Device;

public class AddressDto {
	
//	private int userid;
	private String streetName;
	private int number;
	private String complement;
	private String zipCode;
	private List<Device> devices;
	
	public AddressDto() {
		
	}

	public AddressDto(String streetName, int number, String complement, String zipCode, Device device) {
//		this.userid = userid;
		this.streetName = streetName;
		this.number = number;
		this.complement = complement;
		this.zipCode = zipCode;
		addDevice(device);
	}

//	public int getUserid() {
//		return userid;
//	}
//
//	public void setUserid(int userid) {
//		this.userid = userid;
//	}

	public String getAddress() {
		return streetName;
	}

	public void setAddress(String address) {
		this.streetName = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void addDevice(Device device) {
		this.devices.add(device);
	}



}