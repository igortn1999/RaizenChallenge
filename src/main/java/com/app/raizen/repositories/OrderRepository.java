package com.app.raizen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.raizen.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
