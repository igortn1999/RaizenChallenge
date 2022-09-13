package com.app.raizen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.raizen.models.SolarQuota;

@Repository
public interface SolarQuotaRepository extends JpaRepository<SolarQuota, Integer>{

	public SolarQuota findById(int id);
	
}
