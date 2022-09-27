package com.app.raizen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.raizen.models.Reading;

@Repository
public interface ReadingRepository extends JpaRepository<Reading, Integer>{

}
