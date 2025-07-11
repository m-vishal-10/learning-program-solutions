package com.vishal.handson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishal.handson.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {}