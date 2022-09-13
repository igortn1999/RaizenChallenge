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

import com.app.raizen.models.Provider;
import com.app.raizen.services.ServiceProvider;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/providers")
public class ProviderController {
	
	@Autowired
	ServiceProvider serviceProvider;
	
	@PostMapping
	public @ResponseBody ResponseEntity<Object> saveProvider(@Valid Provider provider) {
		return ResponseEntity.status(HttpStatus.CREATED).body(serviceProvider.save(provider));
	}
	
	@GetMapping
	public ResponseEntity<Object> getProviders(){
		return ResponseEntity.status(HttpStatus.OK).body(serviceProvider.findAll());
	}

}
