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

import com.app.raizen.models.Constants;
import com.app.raizen.services.ServiceConstants;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/const")
public class ConstantsController {
	
	@Autowired
	ServiceConstants serviceConst;
	
	@PostMapping
	public @ResponseBody ResponseEntity<Object> saveConstants(@Valid Constants constants) {
		return ResponseEntity.status(HttpStatus.OK).body(serviceConst.update(constants.getSq_kwh(), constants.getSq_monetary_value()));
	}
	
	@GetMapping
	public ResponseEntity<Object> getConstants(){
		return ResponseEntity.status(HttpStatus.OK).body(serviceConst.findAll());
	}
	
	

}
