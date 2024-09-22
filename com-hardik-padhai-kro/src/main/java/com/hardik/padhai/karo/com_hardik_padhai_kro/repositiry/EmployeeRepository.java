package com.hardik.padhai.karo.com_hardik_padhai_kro.repositiry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hardik.padhai.karo.com_hardik_padhai_kro.bean.EmployeeBean;
import com.hardik.padhai.karo.com_hardik_padhai_kro.entities.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

	
	@Query(value ="select new com.hardik.padhai.karo.com_hardik_padhai_kro.bean.EmployeeBean(emp.empId , emp.firstName , emp.lastName,"
			+ "je.jobTitle, je.minSalary , je.maxSalary)"
			+ "from EmployeeEntity emp "
			+ "inner join JobEntity je on je.jobId = emp.jobId")
	public List<EmployeeBean> findEmployeeListAndSalaryDetails();
	
	
	@Query(value ="select employeeen0_.empid as col_0_0_, employeeen0_.first_name as col_1_0_, "
			+ "employeeen0_.last_name as col_2_0_, jobentity1_.job_title as col_3_0_,"
			+ " jobentity1_.min_salary as col_4_0_, jobentity1_.max_salary as col_5_0_ from "
			+ "employee employeeen0_ inner join job jobentity1_ on "
			+ "(jobentity1_.jobid=employeeen0_.jobid)",nativeQuery = true)
	public List<Object[]> findEmployeeListAndSalaryDetailsUsingNativeQuery();
	

	@Query(value ="select new com.hardik.padhai.karo.com_hardik_padhai_kro.bean.EmployeeBean(emp.empId , emp.firstName , emp.lastName,"
			+ "je.jobTitle, je.minSalary , je.maxSalary,je.jobId)"
			+ "from EmployeeEntity emp "
			+ "inner join JobEntity je on je.jobId = emp.jobId")
	public List<EmployeeBean> findEmployeeListAndJobAndSalaryDetails();
}
