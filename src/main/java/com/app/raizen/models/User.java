package com.app.raizen.models;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import net.bytebuddy.utility.RandomString;

@Entity
@Table(name = "Users", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = { "username", "CPFCNPJ" }))
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "username")//Unique
	private String username;
	
	@Column(name= "password")
	private String password;//encrypted
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surename")
	private String surename;
	
	@Column(name = "CPFCNPJ")
	private String cpfCnpj;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "birthday")
	private Date birthday;
	
	@Column(name = "telephone")
	private String telephone;
	
	
	public User(){
		
	}
	
	public User(String username, String password, String name, String cpfCnpj){
		this.username = username;
		setPassword(password);
		this.name = name;
		this.cpfCnpj = cpfCnpj;
	}
	
	public User(String name, String cpfCnpj){
		this(RandomString.make(6).toString(), "password", name, cpfCnpj);
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

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	
	
	
	
}
