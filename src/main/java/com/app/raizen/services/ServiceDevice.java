package com.app.raizen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.raizen.models.Device;
import com.app.raizen.repositories.DeviceRepository;

@Service
public class ServiceDevice {
	
	@Autowired
	DeviceRepository dr;
	
	@Transactional
	public Object save(Device device) {
		return dr.save(device);
	}

}
