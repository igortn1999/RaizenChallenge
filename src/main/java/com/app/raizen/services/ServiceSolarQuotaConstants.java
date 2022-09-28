package com.app.raizen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.raizen.models.SolarQuotaConstants;
import com.app.raizen.repositories.SolarQuotaConstantsRepository;

@Service
public class ServiceSolarQuotaConstants {
	
	@Autowired
	SolarQuotaConstantsRepository sqcr;

	public Object findAll() {
		return sqcr.findAll();
	}

	public Object update(double kwh, double money) {
		if(kwh <= 0 || money <= 0) {
			return null;
		}
		
		SolarQuotaConstants sqc = sqcr.findAll().get(0);
		
		sqc.setKwh(kwh);
		sqc.setMonetary_value(money);
		
		return sqcr.save(sqc);
	}

}
