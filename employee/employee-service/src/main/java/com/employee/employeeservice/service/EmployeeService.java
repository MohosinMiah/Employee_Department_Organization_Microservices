package com.employee.employeeservice.service;

import com.employee.employeeservice.dto.EmployeeDto;
import com.employee.employeeservice.dto.EmployeeResponse;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    EmployeeResponse getEmployeeById(Long id);
    
}
