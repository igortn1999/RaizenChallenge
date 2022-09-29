package com.app.raizen.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.raizen.models.SolarQuota;

@Repository
public interface SolarQuotaRepository extends JpaRepository<SolarQuota, Integer>{

	Optional<SolarQuota> findByUserId(int user_id);
	
}
