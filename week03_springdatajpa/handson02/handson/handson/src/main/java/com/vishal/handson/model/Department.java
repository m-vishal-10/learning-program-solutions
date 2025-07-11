package com.vishal.handson.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dp_id")  // Correct DB column name
private int id;

@Column(name = "dp_name")
private String name;

    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
    private Set<Employee> employeeList;
    public String getName() {
        return name;
    }
}

