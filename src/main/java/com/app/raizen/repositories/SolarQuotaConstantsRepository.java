package com.app.raizen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.raizen.models.SolarQuotaConstants;

@Repository
public interface SolarQuotaConstantsRepository extends JpaRepository<SolarQuotaConstants, Integer>{

	public SolarQuotaConstants findById(int id);

//	public Object update(@Valid SolarQuotaConstants sq);
	
}
