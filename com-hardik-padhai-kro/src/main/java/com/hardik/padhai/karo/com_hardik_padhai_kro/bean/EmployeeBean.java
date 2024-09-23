package com.hardik.padhai.karo.com_hardik_padhai_kro.bean;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class EmployeeBean {

	
	private Integer empId;
	private String empFirstName;
	private String empLastName;
	private String jobTitle;
	private BigDecimal minSalary;
	private BigDecimal maxSalary;
	private Integer jobId;
	
	
	public EmployeeBean(Integer empId, String empFirstName, String empLastName, String jobTitle, BigDecimal minSalary,
			BigDecimal maxSalary) {
	
//		returnCommmonSetter(empId,empFirstName,empLastName,jobTitle,minSalary,maxSalary);
		
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.jobTitle = jobTitle;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary; 
	}
	
	
	public EmployeeBean(Integer empId, String empFirstName, String empLastName, String jobTitle, BigDecimal minSalary,
			BigDecimal maxSalary,Integer jobId) {
	
		this(empId,empFirstName,empLastName,jobTitle,minSalary,maxSalary);
		this.jobId = jobId;
	}
	
//	private void returnCommmonSetter(Integer empId, String empFirstName, String empLastName, String jobTitle, BigDecimal minSalary,
//			BigDecimal maxSalary) {
//		
//		this.empId = empId;
//		this.empFirstName = empFirstName;
//		this.empLastName = empLastName;
//		this.jobTitle = jobTitle;
//		this.minSalary = minSalary;
//		this.maxSalary = maxSalary; 
//	}
//	
	
}