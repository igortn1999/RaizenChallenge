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

import com.app.raizen.models.Reading;
import com.app.raizen.services.ServiceReading;

@RestController
@CrossOrigin(origins="*", maxAge = 3600)
@RequestMapping("/api/readings")
public class ReadingController {
	
	@Autowired
	ServiceReading serviceReading;
	
	@PostMapping
	public @ResponseBody ResponseEntity<Object> saveReading(@Valid Reading reading){
		return ResponseEntity.status(HttpStatus.CREATED).body(serviceReading.save(reading));
	}
	
	@GetMapping
	public ResponseEntity<Object> getReadings(){
		return ResponseEntity.status(HttpStatus.OK).body(serviceReading.findAll());
	}

}
