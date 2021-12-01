package com.devcarlos.apilocalconsumo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devcarlos.apilocalconsumo.entities.User;

@FeignClient(name = "usuario", url="http://localhost:8080/usuarios")
public interface UserEndPoint {
	
	@RequestMapping(method = RequestMethod.GET, value = "")
	User getUser();

}
