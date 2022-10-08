package com.app.raizen.dto;

import java.util.Date;

import com.app.raizen.models.Address;
import com.app.raizen.models.Device;
import com.app.raizen.models.User;

public class OrderDto {
	
	private int id; 
//	private User user;
	private Address address;
	private Date date;
	private Device device;
	
	public OrderDto() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

}
