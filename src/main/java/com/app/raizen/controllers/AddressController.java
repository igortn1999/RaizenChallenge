package com.app.raizen.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.raizen.models.Address;
import com.app.raizen.services.ServiceAddress;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/addresses")
public class AddressController {
	
	@Autowired
	ServiceAddress serviceAddress;
	
	@PostMapping
	public @ResponseBody ResponseEntity<Object> saveAddress(@Valid Address address ) {
		return ResponseEntity.status(HttpStatus.CREATED).body(serviceAddress.save(address));
	}
	
	@GetMapping
	public ResponseEntity<Object> getAddresses(){
		return ResponseEntity.status(HttpStatus.OK).body(serviceAddress.findAll());
	}
	
}
