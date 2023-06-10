package com.employee.employeeservice.service.Impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employeeservice.dto.EmployeeDto;
import com.employee.employeeservice.entity.Employee;
import com.employee.employeeservice.repository.EmployeeRepository;
import com.employee.employeeservice.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    @Autowired
    private EmployeeRepository employeeRepository;


    @Autowired
    private ModelMapper modelMapper;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto)
    {
        // Convert EmployeeDto to Employee Entity
        Employee employee = modelMapper.map(employeeDto, Employee.class);

        // Save Employee
        employeeRepository.save(employee);

        return employeeDto;
    }
    
}
