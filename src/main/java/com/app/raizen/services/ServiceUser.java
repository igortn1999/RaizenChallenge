package com.app.raizen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.raizen.repositories.UserRepository;

@Service
public class ServiceUser {

	@Autowired
	UserRepository ur;

	public Object findAll() {
		return ur.findAll();
	}
}