package com.devcarlos.apilocalconsumo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devcarlos.apilocalconsumo.entities.User;


@RestController
@RequestMapping("usuario")
public class UserController {
	
	@Autowired
	UserEndPoint userEndPoint;
	
    @GetMapping
	public User getUser() {
		
		
		return userEndPoint.getUser();
		
		
	}
	
	

}
