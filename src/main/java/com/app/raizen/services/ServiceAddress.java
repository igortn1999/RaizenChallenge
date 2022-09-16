package com.app.raizen.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.raizen.models.Address;
import com.app.raizen.repositories.AddressRepository;

@Service
public class ServiceAddress {

	@Autowired
	AddressRepository ar;
	
	@Transactional
	public Object save(@Valid Address address) {
		return ar.save(address);
	}

	public Object findAll() {
		return ar.findAll();
	}

}
