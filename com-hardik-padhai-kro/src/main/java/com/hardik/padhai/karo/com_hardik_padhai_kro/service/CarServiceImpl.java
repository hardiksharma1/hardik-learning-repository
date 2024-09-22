package com.hardik.padhai.karo.com_hardik_padhai_kro.service;

import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl {

	
private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
