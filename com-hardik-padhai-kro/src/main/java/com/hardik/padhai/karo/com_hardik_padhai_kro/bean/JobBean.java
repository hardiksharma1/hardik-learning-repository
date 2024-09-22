package com.hardik.padhai.karo.com_hardik_padhai_kro.bean;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class JobBean {

	
	private Integer jobId;
	private String  jobtitle;
	private BigDecimal minimumSalary;
	private BigDecimal maxSalary;
}
