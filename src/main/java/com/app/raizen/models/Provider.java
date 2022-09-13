package com.app.raizen.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Providers", schema = "public")
public class Provider {

	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surename")
	private String surename;
	
	@Column(name = "CPFCNPJ")
	private String cpfCnpj;
	
	@Column(name = "email")
	private String email;

	@Column(name = "telephone")
	private String telephone;
	
//	@Column(name = "address")
//	private Address addrres;//TODO might cause trouble because of 'userid'
	
	@Column(name = "serviceType")
	private String serviceType;//TODO maybe this should be a List?	
	
	public Provider() {
		
	}

	public Provider(String name, String surename, String cpfCnpj, String email, String telephone, String serviceType) {
		super();
		this.name = name;
		this.surename = surename;
		this.cpfCnpj = cpfCnpj;
		this.email = email;
		this.telephone = telephone;
		this.serviceType = serviceType;
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

	public String getSurename() {
		return surename;
	}

	public void setSurename(String surename) {
		this.surename = surename;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
}
