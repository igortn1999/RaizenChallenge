package com.app.raizen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.raizen.models.Provider;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Integer>{
	
}
