package com.hardik.padhai.karo.com_hardik_padhai_kro.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hardik.padhai.karo.com_hardik_padhai_kro.bean.EmployeeBean;
import com.hardik.padhai.karo.com_hardik_padhai_kro.repositiry.EmployeeRepository;

@Service
public class EmployeeServiceImpl {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public List<EmployeeBean> findEmployeeList(){
		return employeeRepository.findEmployeeListAndSalaryDetails();
	}
	
	public List<Object[]> findEmployeeListNativeQuery(){
		return employeeRepository.findEmployeeListAndSalaryDetailsUsingNativeQuery();
	}
	
	public List<EmployeeBean> findEmployeeListNativeQueryToEmployeeBean(){
		List<Object[]> data =employeeRepository.findEmployeeListAndSalaryDetailsUsingNativeQuery();
		
		return convertObjectArrayToEmployeeBean(data);
	}
	
	public List<EmployeeBean> findEmployeeListWithJobId(){
		return employeeRepository.findEmployeeListAndJobAndSalaryDetails();
	}
	
	
	public List<EmployeeBean> convertObjectArrayToEmployeeBean(List<Object[]> data){
	
		return data.stream().map(x -> new EmployeeBean(objToInteger(x[0]), objToString(x[1]), 
				objToString(x[2]), objToString(x[3]), objToBigDecimal(x[4]), objToBigDecimal(x[5])))
		.collect(Collectors.toList());
	
	}
	
	
	
	
	
	private String objToString(Object object) {
		return object ==null ? "" : object.toString();
	}
	
	private BigDecimal objToBigDecimal(Object object) {
		return object ==null ? BigDecimal.ZERO : new BigDecimal(object.toString());
	}
	
	private Integer objToInteger(Object object) {
		return object ==null ? Integer.MIN_VALUE : Integer.valueOf(object.toString());
	}
}
