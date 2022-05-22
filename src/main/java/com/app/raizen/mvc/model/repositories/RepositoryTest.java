package com.app.raizen.mvc.model.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.raizen.mvc.model.entities.ModelTest;

@Repository
public interface RepositoryTest extends JpaRepository<ModelTest, UUID>{
	
	public Iterable<ModelTest> findByNomeContaining(String nome);
	
	public Iterable<ModelTest> findByNomeContainingIgnoringCase(String nome);
	
}
