package com.tutorials.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorials.couse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}