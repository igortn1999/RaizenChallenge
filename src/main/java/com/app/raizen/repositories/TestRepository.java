package com.app.raizen.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.raizen.models.TestModel;

@Repository
public interface TestRepository extends JpaRepository<TestModel, UUID>{
	
	public Iterable<TestModel> findByNomeContaining(String nome);
	
	public Iterable<TestModel> findByNomeContainingIgnoringCase(String nome);
	
}
