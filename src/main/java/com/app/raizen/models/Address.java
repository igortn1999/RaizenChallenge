package com.app.raizen.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
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
	@Column(name = "streetName")
	private String streetName;
	
	@NotNull
	@Column(name = "number")
	private int number;
	
	@Column(name = "complement")
	private String complement;
	
	@NotNull
	@Column(name = "zipCode")
	private String zipCode;
	
//	@OneToMany(mappedBy = "address")//DO NOT USE THIS IN JAVA SPRING!!!!!!
//	private List<Device> devices;
	
	public Address() {
		//The framework will take care of creating and setting models.
		//Just a empty builder will handle the problem
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
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
	
}
