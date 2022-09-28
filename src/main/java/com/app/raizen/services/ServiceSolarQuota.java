package com.app.raizen.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.raizen.models.SolarQuota;
import com.app.raizen.models.SolarQuotaConstants;
import com.app.raizen.repositories.SolarQuotaConstantsRepository;
import com.app.raizen.repositories.SolarQuotaRepository;

@Service
public class ServiceSolarQuota {
	
	@Autowired
	SolarQuotaRepository sqr;

	@Transactional
	public Object save(@Valid SolarQuota sqc) {
		return sqr.save(sqc);
	}

	public Object findAll() {
		return sqr.findAll();
	}

}
