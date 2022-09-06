package com.app.raizen.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Providers", schema = "public")
public class Providers {

	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surename")
	private String surename;
	
	@Column(name = "CPF_CNPJ")
	private String cpf_cnpj;
	
	@Column(name = "e-mail")
	private String email;

	@Column(name = "telephone")
	private String telephone;
	
	@Column(name = "address")
	private Address addrres;//TODO might cause trouble because of 'userid'
	
	@Column(name = "serviceType")
	private String serviceType;
	
	
	
}
