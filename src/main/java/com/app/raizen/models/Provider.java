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
	
	@Column(name = "cpfcnpj")
	private String cpfcnpj;
	
	@Column(name = "email")
	private String email;

	@Column(name = "telephone")
	private String telephone;
	
//	@Column(name = "address")
//	private Address addrres;//TODO might cause trouble because of 'userid'
	
	@Column(name = "service_type")
	private String service_type;//TODO maybe this should be a List?	
	
	public Provider() {
		
	}

	public Provider(String name, String surename, String cpfCnpj, String email, String telephone, String service_type) {
		super();
		this.name = name;
		this.surename = surename;
		this.cpfcnpj = cpfCnpj;
		this.email = email;
		this.telephone = telephone;
		this.service_type = service_type;
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

	public String getCpfcnpj() {
		return cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
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

	public String getService_type() {
		return service_type;
	}

	public void setService_type(String service_type) {
		this.service_type = service_type;
	}
	
}
