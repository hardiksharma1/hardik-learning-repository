package com.hardik.padhai.karo.com_hardik_padhai_kro.repositiry;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hardik.padhai.karo.com_hardik_padhai_kro.entities.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {

	@Query(value = "",nativeQuery = true)
	public List<Job> findByJobIdAndMinSalary(Integer integer, BigDecimal bigDecimal);

}
