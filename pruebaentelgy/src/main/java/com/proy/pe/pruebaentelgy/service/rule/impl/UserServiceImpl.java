package com.proy.pe.pruebaentelgy.service.rule.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proy.pe.pruebaentelgy.rest.dto.UserResponse;
import com.proy.pe.pruebaentelgy.service.proxy.ApiExterna;
import com.proy.pe.pruebaentelgy.service.rule.UserService;

import java.util.stream.Collectors;



@Service
public class UserServiceImpl implements UserService{

	private ApiExterna apiExterna;

	@Autowired
	public UserServiceImpl(ApiExterna apiExterna) {
		this.apiExterna = apiExterna;
	}

	@Override
	public UserResponse invocarServicioExterno() {

		UserResponse userResponse =  new UserResponse();
		userResponse.setData(apiExterna
				.getApiExterna()
				.getData()
				.stream()
				.map(val -> val.getId() + "|" + val.getLast_name() + "|" + val.getEmail())
				.collect(Collectors.toList()));

		return userResponse;
	}
}
