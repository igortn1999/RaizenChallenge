package com.app.raizen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.raizen.models.Order;
import com.app.raizen.repositories.OrderRepository;

@Service
public class ServiceOrder {
	
	@Autowired
	OrderRepository or;

	@Transactional
	public Order save(Order order) {
		return or.save(order);
	}

	public Object findAll() {
		return or.findAll();
	}

}
