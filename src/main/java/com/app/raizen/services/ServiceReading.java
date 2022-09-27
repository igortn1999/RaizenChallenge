package com.app.raizen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.raizen.models.Reading;
import com.app.raizen.repositories.ReadingRepository;

@Service
public class ServiceReading {

	@Autowired
	ReadingRepository rr;
	
	@Transactional
	public Object save(Reading reading) {
		return rr.save(reading);
	}

	public Object findAll() {
		return rr.findAll();
	}

}
