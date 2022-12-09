package com.rntbci.employee.management.Service;

import com.rntbci.employee.management.model.Employee;

import java.util.List;

public interface  EmployeeService {
	// Save operation
	Employee saveEmployee(Employee employee);
	
	// Read operation
    List<Employee> fetchEmployeeList();
 
    // Update operation
    Employee updateEmployee(Employee Employee, String employeeId);
    
    // get by id operation
    Employee getEmployeeById(String employeeId);
 
    // Delete operation
	void deletEmployeeById(String employeeId);
}


