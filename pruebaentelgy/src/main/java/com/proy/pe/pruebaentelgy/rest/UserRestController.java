package com.proy.pe.pruebaentelgy.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proy.pe.pruebaentelgy.rest.dto.UserResponse;
import com.proy.pe.pruebaentelgy.service.rule.UserService;

@RestController
public class UserRestController {

	private UserService userService;

	@Autowired
	public UserRestController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping(value = "/datarai")
	public UserResponse generarData() {
		
		return userService.invocarServicioExterno();
		
	}
	
}
	