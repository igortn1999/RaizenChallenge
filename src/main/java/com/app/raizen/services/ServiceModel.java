package com.app.raizen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.raizen.models.Model;
import com.app.raizen.repositories.ModelRepository;

@Service
public class ServiceModel {
	
	@Autowired
	ModelRepository mr;
	
	@Transactional
	public Object save(Model model) {
		return mr.save(model);
	}

}
