package com.app.raizen.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.raizen.models.Device;
import com.app.raizen.repositories.DeviceRepository;

import net.bytebuddy.utility.RandomString;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/devices")
public class DeviceController {
	
	@Autowired
	DeviceRepository dr;
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Device saveDevice(@Valid Device device) {
		dr.save(device);
		return device;
	}
	
	@GetMapping
	public Iterable<Device> getDevices(){
		return dr.findAll();
	}
	
	@GetMapping(path = "/name/{namePart}")
	public Iterable<Device> findDeviceByName(@PathVariable String namePart){
		return dr.findByNameContainingIgnoringCase(namePart.trim());
	}
	
	@GetMapping(path = "/id/{namePart}")
	public Iterable<Device> findDeviceById(@PathVariable int id){
		return dr.findById(id);
	}
	
	@GetMapping(path = {"/test"})
	public Iterable<Device> getModels() {
		Device device = new Device("Painel Solar - "+RandomString.make(5));
		dr.save(device);
		return dr.findById(device.getId());
	}

}
