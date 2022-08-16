package com.app.raizen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.raizen.models.Model;
import com.app.raizen.repositories.ModelRepository;

import net.bytebuddy.utility.RandomString;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class Controller {
	
	@Autowired
	ModelRepository mr;
	
	@GetMapping(path = {"/ola"})
	public String ola() {
		return "ola";
	}
	
	@GetMapping(path = {"/api"})
	public Model getModels() {
		Model mod = new Model("Painel Solar - "+RandomString.make(5));
		mr.save(mod);
		return mr.getById(mod.getId());
	}

}
