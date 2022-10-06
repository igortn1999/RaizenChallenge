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

import com.app.raizen.RaizenApplication;

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
	
	@Column(name = "cpfcnpj")
	private String cpfcnpj;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "birthday")
	private Date birthday;
	
	@Column(name = "telephone")
	private String telephone;
	
	@Column(name = "roadmap_step")
	private int roadmap_step = 0;
	
	
	public User(){
		System.out.println("test");
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


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday == null ? new Date() : birthday;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
//		try {
//			MessageDigest digest = MessageDigest.getInstance("MD5");
//			String hash = digest.digest(password.getBytes(StandardCharsets.UTF_8)).toString();
//			this.password = hash;
//		} catch (NoSuchAlgorithmException e) {
//			e.printStackTrace();
//		}
		this.password = RaizenApplication.encrypt(password);
		
	}

	public int getRoadmap_step() {
		return roadmap_step;
	}


	public void setRoadmap_step(int roadmap_step) {
		this.roadmap_step = roadmap_step;
	}

}
