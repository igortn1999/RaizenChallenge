package com.app.raizen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.raizen.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	//TODO find if there are ways to securely query users, or if this is even needed
	
}
