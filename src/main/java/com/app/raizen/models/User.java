package com.app.raizen.models;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.UniqueElements;

import net.bytebuddy.utility.RandomString;

@Entity
@Table(name = "Users", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = { "username", "cpf_cnpj" }))
public class User {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "username")//Unique
	private String username;
	
	@Column(name= "password")
	private String password;
	
	@Column(name = "name")
	private String name;
	
	//password? how to encrypt?
	
	@Column(name = "CPF_CNPJ")
	private String cpf_cnpj;
	
	public User(){
		
	}
	
	public User(String username, String password, String name, String cpf_cnpj){
		this.username = username;
		setPassword(password);
		this.name = name;
		this.cpf_cnpj = cpf_cnpj;
	}
	
	public User(String name, String cpf_cnpj){
		this(RandomString.make(6).toString(), "password", name, cpf_cnpj);
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
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			String hash = digest.digest(password.getBytes(StandardCharsets.UTF_8)).toString();
			this.password = hash;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
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
