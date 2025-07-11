package com.vishal.handson.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sk_id")
private int id;

@Column(name = "sk_name")
private String name;

    @ManyToMany(mappedBy = "skillList")
    private Set<Employee> employeeList;

    public String getName() {
        return name;
    }}

