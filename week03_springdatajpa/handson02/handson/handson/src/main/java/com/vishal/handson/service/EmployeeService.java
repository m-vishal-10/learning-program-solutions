package com.vishal.handson.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vishal.handson.model.Employee;
import com.vishal.handson.repository.EmployeeRepository;


@Service  // Must have this annotation
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    // ✅ Constructor Injection (Recommended)
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllPermanentEmployees() {
        return employeeRepository.getAllPermanentEmployees();
    }
}