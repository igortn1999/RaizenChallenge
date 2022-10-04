package com.app.raizen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.raizen.models.User;
import com.app.raizen.repositories.UserRepository;

@Service
public class ServiceUser {

	@Autowired
	UserRepository ur;

	//Probably not safe. This only exists for testing purposes
	public Object findAll() {
		return ur.findAll(); 
	}

	@Transactional
	public Object save(User user) {
		return ur.save(user);
	}

	public Object nextStep(int user_id) {
		User user = ur.findById(user_id).orElse(null);
		
		if(user==null) {
			return null;
		}
		
		int step =user.getRoadmap_step(); 
		if(step<4) {
			step++;
			user.setRoadmap_step(step);
		}
		
		return ur.save(user);
	}

	public Object resetSteps(int user_id) {
		
		User user = ur.findById(user_id).orElse(null);
		
		if(user==null) {
			return null;
		}
		user.setRoadmap_step(0);
		
		return ur.save(user);
	}
}
