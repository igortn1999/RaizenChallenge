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

import com.app.raizen.dto.SolarQuotaDto;
import com.app.raizen.services.ServiceSolarQuota;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/sq")
public class SolarQuotaController {
	
	@Autowired
	ServiceSolarQuota sqc;
	
//	@PostMapping
//	public @ResponseBody ResponseEntity<Object> saveSQ(@Valid SolarQuota sq) {
//		return ResponseEntity.status(HttpStatus.CREATED).body(sqc.save(sq));
//	}
	
	@PostMapping
	public @ResponseBody ResponseEntity<Object> saveSQ(@Valid SolarQuotaDto sqDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(sqc.save(sqDto));
	}
	
	@GetMapping
	public ResponseEntity<Object> getSQ(){
		return ResponseEntity.status(HttpStatus.OK).body(sqc.findAll());
	}

}
