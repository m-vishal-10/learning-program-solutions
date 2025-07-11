package com.vishal.handson.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "em_id")
private int id;

@Column(name = "em_name")
private String name;

@Column(name = "em_salary")
private BigDecimal salary;

@Column(name = "em_permanent")
private boolean permanent;

@Column(name = "em_date_of_birth")
private Date dateOfBirth;   

    @ManyToOne
    @JoinColumn(name = "em_dp_id")
    private Department department;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "employee_skill",
        joinColumns = @JoinColumn(name = "es_em_id"),
        inverseJoinColumns = @JoinColumn(name = "es_sk_id")
    )
    private Set<Skill> skillList;

    public String getName() {
        return name;
    }
    public Department getDepartment() {
        return department;
    }
    public Set<Skill> getSkillList() {
        return skillList;
    }
}

