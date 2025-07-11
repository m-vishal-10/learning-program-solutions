package com.vishal.handson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vishal.handson.model.Employee;
import com.vishal.handson.repository.CountryRepository;
import com.vishal.handson.repository.DepartmentRepository;
import com.vishal.handson.repository.EmployeeRepository;
import com.vishal.handson.repository.SkillRepository;
import com.vishal.handson.repository.StockRepository;
import com.vishal.handson.service.EmployeeService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class HandsonApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(HandsonApplication.class);
	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private StockRepository stockRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private SkillRepository skillRepository;

	public static void main(String[] args) {
		SpringApplication.run(HandsonApplication.class, args);
	}

	@PostConstruct
	public void runAllTests() throws Exception {
		testGetAllPermanentEmployees();
	}

	private void testCountryQueries() {
		LOGGER.info("=== Running Country Queries ===");
		LOGGER.info("Countries containing 'ou': {}", countryRepository.findByNameContainingIgnoreCase("ou"));
		LOGGER.info("Countries containing 'ou' ordered by name: {}",
				countryRepository.findByNameContainingIgnoreCaseOrderByNameAsc("ou"));
		LOGGER.info("Countries starting with 'Z': {}", countryRepository.findByNameStartingWith("Z"));
	}

	private void testStockQueries() {
		LOGGER.info("=== Running Stock Queries ===");
		// Example test (add your real stock queries here)
		LOGGER.info("All Stock Entries: {}", stockRepository.findAll());
	}

	private void testORMapping() {
		LOGGER.info("=== Running OR Mapping Tests ===");
		// Add your ORM mapping test logic here with logger later
	}
	public void testGetAllPermanentEmployees() {
    List<Employee> employees = employeeService.getAllPermanentEmployees();
    employees.forEach(e -> {
        System.out.println("Employee: " + e.getName());
        System.out.println("Department: " + e.getDepartment().getName());
        System.out.println("Skills: " + e.getSkillList());
    });
}


}
