package com.app.raizen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.raizen.models.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{
	//TODO methods to query addresses
}
