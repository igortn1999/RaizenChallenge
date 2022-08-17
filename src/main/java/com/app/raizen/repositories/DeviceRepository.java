package com.app.raizen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.raizen.models.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer>{
	
	public Iterable<Device> findByNameContaining(String namePart);
	
	public Iterable<Device> findByNameContainingIgnoringCase(String namePart);
	
	public Iterable<Device> findById(int id);

}
