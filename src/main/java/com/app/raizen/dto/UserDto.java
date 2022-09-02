package com.app.raizen.dto;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UserDto {
	
	private int id;
	private String username;
	private String password;
	private String name;
	private String cpf_cnpj;
	
	public UserDto() {
		
	}
	
	

	public UserDto(int id, String username, String password, String name, String cpf_cnpj) {
		this.id = id;
		this.username = username;
		setPassword(password);
		this.name = name;
		this.cpf_cnpj = cpf_cnpj;
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

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

}
