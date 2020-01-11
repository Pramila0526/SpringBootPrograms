package com.bridgelabz.fundoo.service;
import java.util.ArrayList;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * 
 * @author admin94
 *	Purpose	: This becomes the Spring Service
 *				the security configurer is going to resolve the spring security
 *
 */
public class MyUserDetailsService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		return new User("foo","foo",new ArrayList<>());  // Username And Password 
					  //username  //password
	}
}
