package com.app.raizen.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
	
	@GetMapping(path = {"/ola"})
	public String ola() {
		return "ola";
	}

}
