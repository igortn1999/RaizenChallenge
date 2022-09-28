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

import com.app.raizen.models.SolarQuotaConstants;
import com.app.raizen.services.ServiceSolarQuotaConstants;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/sqconst")
public class SolarQuotaConstantsController {
	
	@Autowired
	ServiceSolarQuotaConstants ssqc;
	
	@PostMapping
	public @ResponseBody ResponseEntity<Object> saveSQC(@Valid SolarQuotaConstants sqc) {
		return ResponseEntity.status(HttpStatus.OK).body(ssqc.update(sqc.getKwh(), sqc.getMonetary_value()));
	}
	
	@GetMapping
	public ResponseEntity<Object> getSQC(){
		return ResponseEntity.status(HttpStatus.OK).body(ssqc.findAll());
	}
	
	

}
