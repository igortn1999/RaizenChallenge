package com.app.raizen.dto;

import java.util.Date;

public class UserDto {
	
	private int id;
	private String username;
	private String password;
	private String name;
	private String surename;
	private String cpf_cnpj;
	private String email;
	private Date birthday;
	private String telephone;
	
	public UserDto() {
		
	}

	public UserDto(int id, String username, String password, String name, String surename, String cpf_cnpj,
			String email, Date birthday, String telephone) {
		super();
		this.id = id;
		this.username = username;
		setPassword(password);
		this.name = name;
		this.surename = surename;
		this.cpf_cnpj = cpf_cnpj;
		this.email = email;
		this.birthday = birthday;
		this.telephone = telephone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
}
