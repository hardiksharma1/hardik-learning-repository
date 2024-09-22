package com.hardik.padhai.karo.com_hardik_padhai_kro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hardik.padhai.karo.com_hardik_padhai_kro.entities.Job;
import com.hardik.padhai.karo.com_hardik_padhai_kro.service.CarServiceImpl;
import com.hardik.padhai.karo.com_hardik_padhai_kro.service.JobServiceImpl;

@RestController
public class JobController {

	@Autowired
	private JobServiceImpl jobServiceImpl;
	
	@Autowired
	private CarServiceImpl car;
	
	
	@GetMapping("records")
	public List<Job> findAllRec(){
		car.setName("Bike");
		return jobServiceImpl.allRecords();
	}
	
	
}
