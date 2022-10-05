package com.app.raizen.services;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.raizen.RaizenApplication;
import com.app.raizen.models.Constants;
import com.app.raizen.models.User;
import com.app.raizen.repositories.ConstantsRepository;
import com.app.raizen.repositories.UserRepository;

@Service
public class ServiceConstants {
	
	@Autowired
	ConstantsRepository constrepo;
	
	@Autowired 
	UserRepository userRepo;

	public Object findAll() {
		return constrepo.findAll();
	}

	public Object update(double kwh, double money) {
		if(kwh <= 0 || money <= 0) {
			return null;
		}
		
		Constants constants = constrepo.findAll().get(0);
		
		constants.setSq_kwh(kwh);
		constants.setSq_monetary_value(money);
		
		return constrepo.save(constants);
	}

//	public Object setCurrentUser(String user_id) {
//		
//		Constants sqc = constrepo.findAll().get(0);
//		
//		return null;
//	}

	public Object login(String username, String password) {
		Constants constants = constrepo.findAll().get(0);
		User user = userRepo.findByUsername(username);
//		String hash = null;
//		try {
//			MessageDigest digest = MessageDigest.getInstance("MD5");
//			hash = digest.digest(password.getBytes(StandardCharsets.UTF_8)).toString();
//		} catch (NoSuchAlgorithmException e) {
//			e.printStackTrace();
//		}
		String hash = RaizenApplication.encrypt(password);
		if(user != null && user.getPassword().compareTo(hash)==0) {
			constants.setUser_id(user.getId());
			constrepo.save(constants);
			return constants;
		}
		return null;
	}

	public Object logout() {
		Constants sqc = constrepo.findAll().get(0);
		sqc.setUser_id(0);
		return sqc;
	}

}
