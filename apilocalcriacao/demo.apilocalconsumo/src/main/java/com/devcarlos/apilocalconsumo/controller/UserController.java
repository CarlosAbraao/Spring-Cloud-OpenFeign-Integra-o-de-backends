package com.devcarlos.apilocalconsumo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devcarlos.apilocalconsumo.entities.User;


@RestController
@RequestMapping("usuarios")
public class UserController {
	
    @GetMapping
	public User getUser() {
		
		User user = new User();
	
		
		
		user.setTitle("API CRIADA!!");
		user.setName("Carlos Abraão Chaves");
		user.setEmail("carlos@carlos.com.br");
		user.setIdade(35);
		
		return user;
		
		
	}
    }
	

