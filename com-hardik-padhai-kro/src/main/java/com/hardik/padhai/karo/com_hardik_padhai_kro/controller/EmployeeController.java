package com.hardik.padhai.karo.com_hardik_padhai_kro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hardik.padhai.karo.com_hardik_padhai_kro.bean.EmployeeBean;

@RestController
@RequestMapping("/ade")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	@GetMapping("/empList")
	public List<EmployeeBean> findEmployeeList(){
		return employeeServiceImpl.findEmployeeList();
	}
	
	@GetMapping("/empList/nativeQuery")
	public List<Object[]> findEmployeeListnativeQuery(){
		System.out.println(employeeServiceImpl.findEmployeeListNativeQuery());
		return employeeServiceImpl.findEmployeeListNativeQuery();
	}
	
	@GetMapping("/empList/nativeQueryToBean")
	public List<EmployeeBean> findEmployeeListnativeQueryToBean(){
		System.out.println(employeeServiceImpl.findEmployeeListNativeQuery());
		return employeeServiceImpl.findEmployeeListNativeQueryToEmployeeBean();
	}
	
	@GetMapping("/empList/jobId")
	public List<EmployeeBean> findEmployeeListWithJobId(){
		return employeeServiceImpl.findEmployeeListWithJobId();
	}
	
	

}
