package com.techlabs.springsecuritydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techlabs.springsecuritydemo.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Integer>{
	Role findByRolename(String rolename);

}
