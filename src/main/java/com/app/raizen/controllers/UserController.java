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

import com.app.raizen.models.Device;
import com.app.raizen.models.User;
import com.app.raizen.services.ServiceUser;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	ServiceUser serviceUser;
	
	@GetMapping
	public ResponseEntity<Object> getUsers(){
		return ResponseEntity.status(HttpStatus.OK).body(serviceUser.findAll());
	}
	
	@PostMapping
	public @ResponseBody ResponseEntity<Object> saveDevice(@Valid User user) {
		return ResponseEntity.status(HttpStatus.CREATED).body(serviceUser.save(user));
	}
	
	@PostMapping(path="/nextStep")
	public @ResponseBody ResponseEntity<Object> nextStep(int user_id){
		return ResponseEntity.status(HttpStatus.OK).body(serviceUser.nextStep(user_id));
	}
	
	@PostMapping(path="/resetSteps")
	public @ResponseBody ResponseEntity<Object> resetSteps(int user_id){
		return ResponseEntity.status(HttpStatus.OK).body(serviceUser.resetSteps(user_id));
	}
	
	
	
	

}
