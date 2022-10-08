package com.app.raizen.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Addresses", schema = "public")
public class Address {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	@Column(name = "zip_code")
	private String zip_code;
	
	@NotNull
	@Column(name = "state")
	private String state;
	
	@NotNull
	@Column(name = "city")
	private String city;
	
	@NotNull
	@Column(name = "neighborhood")
	private String neighborhood;
	
	@NotNull
	@Column(name = "street")
	private String street;
	
	@NotNull
	@Column(name = "number")
	private int number;
	
	@Column(name = "complement")
	private String complement;
	
	@NotNull
	@ManyToOne
	private User user;
	
//	@OneToMany(mappedBy = "address")//DO NOT USE THIS IN JAVA SPRING!!!!!!
//	private List<Device> devices;//CAUSES MEMORY LEAK
	
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

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

		
}
