package com.app.raizen.controllers;

import com.app.raizen.models.TestModel;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.raizen.service.ServiceModel;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ApiController {
	
	@Autowired
	ServiceModel modelService;

	@PutMapping("/api")
	public ResponseEntity<Object> put() {
		TestModel tm = new TestModel();
		tm.setNome("AAA");

		return ResponseEntity.status(HttpStatus.OK).body(modelService.save(tm));
	}

}
