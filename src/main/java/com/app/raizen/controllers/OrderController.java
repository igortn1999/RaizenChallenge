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

import com.app.raizen.models.Order;
import com.app.raizen.services.ServiceOrder;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/orders")
public class OrderController {
	
	@Autowired
	ServiceOrder serviceOrder;
	
	@PostMapping
	public @ResponseBody ResponseEntity<Object> saveOrder(@Valid Order order) {
		return ResponseEntity.status(HttpStatus.CREATED).body(serviceOrder.save(order));
	}
	
	@GetMapping
	public ResponseEntity<Object> getOrders(){
		return ResponseEntity.status(HttpStatus.OK).body(serviceOrder.findAll());
	}

}
