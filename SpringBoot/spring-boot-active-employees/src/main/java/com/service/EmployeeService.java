package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {
	public List<Employee> getActiveEmployeesWithHighSalary();
}
