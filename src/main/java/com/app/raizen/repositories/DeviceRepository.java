package com.app.raizen.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.raizen.dto.DeviceDto;
import com.app.raizen.models.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer>{
	
//	@Query(value = "SELECT new com.app.raizen.dto.DeviceDto(u.id, u.name, u.consumption, u.address, u.lastMaintenance) " + "FROM Device u WHERE u.name LIKE %?1%")
//	public List<DeviceDto> findByNameContaining(@Param("namePart") String namePart);
	
	public Device findById(int id);
	
	public List<Device> findByConsumption(@Param("consumption") double consumption);
	
}
