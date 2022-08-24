package com.app.raizen.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users", schema = "public")
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "name")//Not duplicate
	private String name;
	
	//password? how to encrypt?
	
	@Column(name = "CPF_CNPJ")
	private String cpf_cnpj;
	
	public User(){
		
	}
	
	public User(String name, String cpf_cnpj){
		this.name = name;
		this.cpf_cnpj = cpf_cnpj;
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

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	
	
}
