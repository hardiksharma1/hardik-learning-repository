package com.hardik.padhai.karo.com_hardik_padhai_kro.entities;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Job")
public class JobEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JobID")
    private int jobId;

    @Column(name = "JobTitle", nullable = false, length = 100)
    private String jobTitle;

    @Column(name = "MinSalary", precision = 10, scale = 2)
    private BigDecimal minSalary;

    @Column(name = "MaxSalary", precision = 10, scale = 2)
    private BigDecimal maxSalary;

    // Constructors
    public JobEntity() {}

    public JobEntity(String jobTitle, BigDecimal minSalary, BigDecimal maxSalary) {
        this.jobTitle = jobTitle;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    // Getters and Setters
    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public BigDecimal getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(BigDecimal minSalary) {
        this.minSalary = minSalary;
    }

    public BigDecimal getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(BigDecimal maxSalary) {
        this.maxSalary = maxSalary;
    }
}
