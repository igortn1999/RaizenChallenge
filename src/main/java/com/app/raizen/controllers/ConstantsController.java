package com.app.raizen.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.raizen.models.Constants;
import com.app.raizen.services.ServiceConstants;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ConstantsController {
	
	@Autowired
	ServiceConstants serviceConst;
	
	@PostMapping(path="/api/const")
	public @ResponseBody ResponseEntity<Object> saveConstants(@Valid Constants constants) {
		return ResponseEntity.status(HttpStatus.OK).body(serviceConst.update(constants.getSq_kwh(), constants.getSq_monetary_value()));
	}
	
	@GetMapping(path="/api/const")
	public ResponseEntity<Object> getConstants(){
		return ResponseEntity.status(HttpStatus.OK).body(serviceConst.findAll());
	}
	
	@PostMapping(path="/api/login")
	public ResponseEntity<Object> login(String username, String password){
		Object ret = serviceConst.login(username, password);
		if(ret!=null) {
			return ResponseEntity.status(HttpStatus.OK).body(ret);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ret);
	}
	
	@PostMapping(path="/api/logout")
	public ResponseEntity<Object> logout(){
		return ResponseEntity.status(HttpStatus.OK).body(serviceConst.logout());
	}
	
	
//	@PostMapping(path="/api/setUser")
//	public ResponseEntity<Object> setCurrentUser(String user_id){
//		return ResponseEntity.status(HttpStatus.OK).body(serviceConst.setCurrentUser(user_id));
//	}
	
	
	

}
