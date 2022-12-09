package com.rntbci.employee.management.controller;


import com.rntbci.employee.management.Service.EmployeeService;
import com.rntbci.employee.management.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	@Autowired private EmployeeService employeeService;
	
	// Save operation
    @PostMapping(value ="/add")
    public String saveEmployee(@RequestBody Employee employee)
    {
        employeeService.saveEmployee(employee);
        return "added Successfully";
    }
    
    // Read operation
    @GetMapping(value ="/emp")
    public List<Employee> fetchEmployeeList()
    {
        return employeeService.fetchEmployeeList();
    }
    
    @GetMapping(value ="/emp/{employee_id}")
    public Employee findEmployeeById(@PathVariable("employee_id") String employeeId)
    {
        return employeeService.getEmployeeById(employeeId);
    }
 
    // Update operation
    @PutMapping(value ="/emp/{employee_id}")
    public Employee updateEmployee(@RequestBody Employee employee,@PathVariable("employee_id") String employeeId)
    {
        return employeeService.updateEmployee(
        		employee, employeeId);
    }
 
    // Delete operation
    @DeleteMapping(value ="/delete/{employee_id}")
    public String deleteEmployeeById(@PathVariable("employee_id") String employeeId)
    {
    	employeeService.deletEmployeeById(employeeId);
        return "Deleted Successfully";
    }
    
    @GetMapping(value ="/test")
    public String findEmployeeById()
    {
        return "test";
    }
    

}
