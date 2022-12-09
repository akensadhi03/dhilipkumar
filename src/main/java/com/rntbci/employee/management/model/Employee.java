package com.rntbci.employee.management.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "employees")
public class Employee {
	@Id
    @Column(name = "employee_id")
	private String employeeId;
    @Column(name = "employee_name")
    private String employeeName;
	@Column(name = "department")
    private String department;
	@Column(name = "address")
    private String address;
}
