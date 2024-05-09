package com.tutorials.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorials.couse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}