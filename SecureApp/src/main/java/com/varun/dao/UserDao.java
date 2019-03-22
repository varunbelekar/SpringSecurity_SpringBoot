package com.varun.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.varun.model.User;

public interface UserDao extends JpaRepository<User,Integer>{
	User findByUsername(String username);
}
