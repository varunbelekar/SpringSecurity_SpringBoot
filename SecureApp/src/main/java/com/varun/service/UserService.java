package com.varun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.varun.UserPrincipal;
import com.varun.dao.UserDao;
import com.varun.model.User;

@Service
public class UserService implements UserDetailsService {
	@Autowired
	UserDao dao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user=dao.findByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("User not found");
		}
		return new UserPrincipal(user);
	}

}
