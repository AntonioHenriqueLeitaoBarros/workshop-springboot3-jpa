package com.tutorials.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorials.couse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}