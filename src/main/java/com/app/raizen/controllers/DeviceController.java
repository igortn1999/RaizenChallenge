package com.app.raizen.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.raizen.models.Device;
import com.app.raizen.services.ServiceDevice;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/devices")
public class DeviceController {
	
	@Autowired
	ServiceDevice serviceDevice;
	
	@PostMapping
	public @ResponseBody ResponseEntity<Object> saveDevice(@Valid Device device) {
		return ResponseEntity.status(HttpStatus.CREATED).body(serviceDevice.save(device));
	}
	
	@GetMapping
	public ResponseEntity<Object> getDevices(){
		return ResponseEntity.status(HttpStatus.OK).body(serviceDevice.findAll());
	}
	
	@GetMapping(path = "/name/{namePart}")
	public ResponseEntity<Object> findDeviceByName(@PathVariable String namePart){
		return ResponseEntity.status(HttpStatus.OK).body(serviceDevice.findByNameContaining(namePart));
	}
	
	@GetMapping(path = "/id/{id}")
	public ResponseEntity<Object> findDeviceByName(@PathVariable int id){
		return ResponseEntity.status(HttpStatus.OK).body(serviceDevice.findById(id));
	}
	
	@GetMapping(path = "/kwh/{consumption}")
	public ResponseEntity<Object> findDeviceByConsumption(@PathVariable double consumption){
		return ResponseEntity.status(HttpStatus.OK).body(serviceDevice.findByConsumption(consumption));
	}
	
	@GetMapping(path = "/id/{id}/kwh")
	public ResponseEntity<Object> getConsumption(@PathVariable int id) throws Exception{
		ResponseEntity<Object> res = ResponseEntity.status(HttpStatus.OK).body(((Device)serviceDevice.findById(id)).getConsumption());
		if (res == null){
			//TODO figure out what to do if there is no Device with required ID
		}
		return res;
		
	}
	
}
