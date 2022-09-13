package com.app.raizen.dto;

public class AddressDto {
	
//	private int userid;
	private String streetName;
	private int number;
	private String complement;
	private String zipCode;
	private boolean hasDevice;
	
	public AddressDto() {
		
	}

	public AddressDto(int userid, String streetName, int number, String complement, String zipCode, boolean hasDevice) {
		super();
//		this.userid = userid;
		this.streetName = streetName;
		this.number = number;
		this.complement = complement;
		this.zipCode = zipCode;
		this.hasDevice = hasDevice;
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

	public boolean isHasDevice() {
		return hasDevice;
	}

	public void setHasDevice(boolean hasDevice) {
		this.hasDevice = hasDevice;
	}

}
