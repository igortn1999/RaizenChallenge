package com.app.raizen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.raizen.models.TestModel;
import com.app.raizen.repositories.TestRepository;

@Service
public class ServiceModel {
	@Autowired
	TestRepository repositoryTest;
	
	@Transactional
	public Object save(TestModel model) {
		return repositoryTest.save(model);
	}
}
