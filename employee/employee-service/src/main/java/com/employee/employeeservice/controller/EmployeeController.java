package com.employee.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeeservice.dto.EmployeeDto;
import com.employee.employeeservice.dto.EmployeeResponse;
import com.employee.employeeservice.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
@RefreshScope
public class EmployeeController {

    @Value("${spring.app.message}")
    String message;

    @Autowired
    private EmployeeService employeeService;
    

    @GetMapping("/message")
    public String message(){
        return message;
    }
    // Build Save Employee Rest API Endpoint
    @PostMapping
    public ResponseEntity<EmployeeDto> savEmployee(@RequestBody EmployeeDto employeeDto)
    {
        EmployeeDto savEmployee =  employeeService.saveEmployee(employeeDto);

        return new ResponseEntity<>(savEmployee,HttpStatus.CREATED);
    }

    // Build Get Employee By ID Rest API
    @GetMapping("{employee-id}")
    public ResponseEntity<EmployeeResponse> getEmployeeById(@PathVariable("employee-id") Long id )
    {
        EmployeeResponse employee = employeeService.getEmployeeById(id);

        return new ResponseEntity<>(employee,HttpStatus.OK);
    }



    
}
