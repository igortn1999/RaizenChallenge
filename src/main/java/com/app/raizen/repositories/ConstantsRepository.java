package com.app.raizen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.raizen.models.Constants;

@Repository
public interface ConstantsRepository extends JpaRepository<Constants, Integer>{

	public Constants findById(int id);

//	public Object update(@Valid SolarQuotaConstants sq);
	
}
