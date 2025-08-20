package com.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private List<Employee> employees = Arrays.asList(
	        new Employee(1, "Alice", 12000, true),
	        new Employee(2, "Bob", 8000, true),
	        new Employee(3, "Charlie", 15000, false),
	        new Employee(4, "David", 18000, true)
	    );

	    public List<Employee> getActiveEmployeesWithHighSalary() {
	        return employees.stream()
	                .filter(emp -> emp.isActive() && emp.getSalary() > 10000)
	                .collect(Collectors.toList());
	    }

}
