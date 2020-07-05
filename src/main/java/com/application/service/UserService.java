package com.application.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.application.model.User;
import com.application.web.dto.UserRegistrationDto;

public interface UserService  extends UserDetailsService{
	
	User save(UserRegistrationDto registrationDto);

}
