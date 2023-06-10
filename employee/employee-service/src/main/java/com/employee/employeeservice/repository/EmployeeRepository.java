package com.employee.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employeeservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    
}
