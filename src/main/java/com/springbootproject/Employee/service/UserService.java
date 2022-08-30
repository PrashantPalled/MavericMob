package com.springbootproject.Employee.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.springbootproject.Employee.dto.UserRegistrationDto;
import com.springbootproject.Employee.model.User;




public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
