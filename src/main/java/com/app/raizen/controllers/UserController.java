package com.app.raizen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.raizen.services.ServiceUser;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	ServiceUser serviceUser;
	
	@GetMapping
	public ResponseEntity<Object> getDevices(){
		return ResponseEntity.status(HttpStatus.OK).body(serviceUser.findAll());
	}

}
