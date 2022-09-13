package com.app.raizen.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Addresses", schema = "public")
public class Address {
	
	@Id
	@GeneratedValue
	private int id;
	
//	@NotNull
//	@Column(name = "userid")
//	private int userid;
	
	@NotNull
	@Column(name = "Streetname")
	private String streetName;
	
	@NotNull
	@Column(name = "number")
	private int number;
	
	@Column(name = "complement")
	private String complement;
	
	@NotNull
	@Column(name = "zipcode")
	private String zipCode;
	
	@Column(name = "hasdevice")
	private boolean hasDevice;
	
	public Address() {
		
	}

	public Address(int userid, String streetName, int number, String complement, String zipCode, boolean hasDevice) {
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
