package com.hardik.padhai.karo.com_hardik_padhai_kro.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hardik.padhai.karo.com_hardik_padhai_kro.entities.JobEntity;
import com.hardik.padhai.karo.com_hardik_padhai_kro.repositiry.JobRepository;

@Service
public class JobServiceImpl {

	
	@Autowired
	private JobRepository jobRepository;
	
	@Autowired
	private CarServiceImpl car;
	
	
	public List<JobEntity> allRecords(){
		
		System.out.println(car.getName());
		return jobRepository.findByJobIdAndMinSalary(Integer.valueOf(1),BigDecimal.valueOf(60000));
}
}
