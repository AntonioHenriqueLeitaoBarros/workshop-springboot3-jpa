package com.tutorials.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorials.couse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}