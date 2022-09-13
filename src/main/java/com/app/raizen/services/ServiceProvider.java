package com.app.raizen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.raizen.models.Provider;
import com.app.raizen.repositories.ProviderRepository;

@Service
public class ServiceProvider {
	
	@Autowired
	ProviderRepository pr;

	@Transactional
	public Object save(Provider provider) {
		return pr.save(provider);
	}

	public Object findAll() {
		return pr.findAll();
	}

}
