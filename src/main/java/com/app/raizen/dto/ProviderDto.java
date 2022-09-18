package com.app.raizen.dto;

public class ProviderDto {
	
	private int id;
	private String name;
	private String surename;
	private String cpfcnpj;
	private String email;
	private String telephone;
//	private Address address;//TODO create relationship
	private String service_type;//TODO maybe this should be a List?

	public ProviderDto(){
		
	}

	public ProviderDto(int id, String name, String surename, String cpfcnpj, String email, String telephone, String service_type) {
		this.id = id;
		this.name = name;
		this.surename = surename;
		this.cpfcnpj = cpfcnpj;
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

	public void setService_type(String serviceType) {
		this.service_type = serviceType;
	}
	
}
