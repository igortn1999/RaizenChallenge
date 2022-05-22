package com.app.raizen.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.raizen.mvc.model.entities.ModelTest;
import com.app.raizen.mvc.service.ModelService;

@RestController
public class ControllerTest {
	
	@Autowired
	ModelService modelService;


	@GetMapping(path = {"/ola"})
	public String ola() {
		return "ola";
	}
	
	@GetMapping(path= {"/api"})
	public ResponseEntity<Object> api() {
		ModelTest mt = new ModelTest();
		mt.setNome("PainelSolar");
		return ResponseEntity.status(HttpStatus.CREATED).body(modelService.save(mt));
	}

}
