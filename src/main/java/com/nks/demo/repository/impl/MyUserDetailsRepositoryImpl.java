package com.nks.demo.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nks.demo.entity.User;
import com.nks.demo.entity.UserPrincipal;
import com.nks.demo.repository.UserReposiory;

@Service
public class MyUserDetailsRepositoryImpl implements UserDetailsService {
	
	@Autowired
	private UserReposiory repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("Inside loadUserByUsername 1 ");
		
		User user = repo.findByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("Error 404");
		}
		System.out.println("Inside loadUserByUsername 2 ");
		return new UserPrincipal(user);
	}

}
