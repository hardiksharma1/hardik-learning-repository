package com.hardik.padhai.karo.com_hardik_padhai_kro.repositiry;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hardik.padhai.karo.com_hardik_padhai_kro.entities.JobEntity;

@Repository
public interface JobRepository extends JpaRepository<JobEntity, Integer> {

	public List<JobEntity> findByJobIdAndMinSalary(Integer integer, BigDecimal bigDecimal);

	
}
