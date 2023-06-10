package com.employee.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeeservice.dto.EmployeeDto;
import com.employee.employeeservice.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    
    // Build Save Employee Rest API Endpoint
    @PostMapping
    public ResponseEntity<EmployeeDto> savEmployee(@RequestBody EmployeeDto employeeDto)
    {
        EmployeeDto savEmployee =  employeeService.saveEmployee(employeeDto);

        return new ResponseEntity<>(savEmployee,HttpStatus.CREATED);
    }


    
}