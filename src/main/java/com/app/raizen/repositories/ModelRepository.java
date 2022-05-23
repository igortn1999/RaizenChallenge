package com.app.raizen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.raizen.models.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Integer>{

}
