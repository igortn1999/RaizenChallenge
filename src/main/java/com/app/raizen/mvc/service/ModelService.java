package com.app.raizen.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.raizen.mvc.model.entities.ModelTest;
import com.app.raizen.mvc.model.repositories.RepositoryTest;

@Service
public class ModelService {
	@Autowired
	RepositoryTest repositoryTest;
	
	@Transactional
	public String save(ModelTest model) {
		repositoryTest.save(model);
		return "aaa";
	}
	
}
