package com.app.raizen.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.raizen.dto.SolarQuotaDto;
import com.app.raizen.models.SolarQuota;
import com.app.raizen.models.Constants;
import com.app.raizen.repositories.ConstantsRepository;
import com.app.raizen.repositories.SolarQuotaRepository;
import com.app.raizen.repositories.UserRepository;

@Service
public class ServiceSolarQuota {
	
	@Autowired
	SolarQuotaRepository sqr;
	
	@Autowired
	ConstantsRepository constants;

	@Autowired
	UserRepository userRepository;
	
	@Transactional
	public Object save(@Valid SolarQuotaDto sqDto) {
		//maybe there will we problems with User
		SolarQuota sq = new SolarQuota();
		Constants sqc = constants.findAll().get(0);
		
		double customerConsuption = sqDto.getCustomer_consumption();
		double eachQuotaValue = sqc.getSq_monetary_value();
		double kwhEquivalentToOneSolarQuota = sqc.getSq_kwh();
		
		double quantityAux = (customerConsuption/kwhEquivalentToOneSolarQuota);
		int quantity =(int)( quantityAux %1 == 0? quantityAux : quantityAux +1);
		
		sq.setUser(userRepository.findById(sqDto.getUser_id()).orElse(null));
		sq.setQuantity(quantity);
		sq.setCustomer_consumption(customerConsuption);
		sq.setCost(sq.getQuantity()*eachQuotaValue);
		
		return sqr.save(sq);
	}

	public Object findAll() {
		return sqr.findAll();
	}

}
