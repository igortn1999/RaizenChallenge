package com.app.raizen.dto;

public class ProviderDto {
	
	private int id;
	private String name;
	private String surename;
	private String cpf_cnpj;
	private String email;
	private String telephone;
//	private Address addrres;//TODO might cause trouble because of 'userid'
	private String serviceType;//TODO maybe this should be a List?

	public ProviderDto(){
		
	}

	public ProviderDto(int id, String name, String surename, String cpf_cnpj, String email, String telephone, String serviceType) {
		this.id = id;
		this.name = name;
		this.surename = surename;
		this.cpf_cnpj = cpf_cnpj;
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

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
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
