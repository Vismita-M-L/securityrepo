package com.techlabs.springsecuritydemo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techlabs.springsecuritydemo.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{
Optional<User> findByUsername(String username);
boolean existsByusername(String username);
}
