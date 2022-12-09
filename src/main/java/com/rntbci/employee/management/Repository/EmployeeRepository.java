package com.rntbci.employee.management.Repository;


import com.rntbci.employee.management.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {

	Optional<Employee> findById(String employeeId);


}
