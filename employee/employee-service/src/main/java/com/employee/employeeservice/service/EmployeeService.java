package com.employee.employeeservice.service;

import com.employee.employeeservice.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    EmployeeDto findById(Long id);
    
}
