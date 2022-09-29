package com.app.raizen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.raizen.models.Constants;
import com.app.raizen.repositories.ConstantsRepository;

@Service
public class ServiceConstants {
	
	@Autowired
	ConstantsRepository constrepo;

	public Object findAll() {
		return constrepo.findAll();
	}

	public Object update(double kwh, double money) {
		if(kwh <= 0 || money <= 0) {
			return null;
		}
		
		Constants sqc = constrepo.findAll().get(0);
		
		sqc.setSq_kwh(kwh);
		sqc.setSq_monetary_value(money);
		
		return constrepo.save(sqc);
	}

}
