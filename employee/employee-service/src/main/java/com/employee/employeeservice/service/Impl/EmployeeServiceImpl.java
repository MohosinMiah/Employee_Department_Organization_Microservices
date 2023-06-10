package com.employee.employeeservice.service.Impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.employee.employeeservice.dto.DepartmentDto;
import com.employee.employeeservice.dto.EmployeeDto;
import com.employee.employeeservice.dto.EmployeeResponse;
import com.employee.employeeservice.entity.Employee;
import com.employee.employeeservice.repository.EmployeeRepository;
import com.employee.employeeservice.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto)
    {
        // Convert EmployeeDto to Employee Entity
        Employee employee = modelMapper.map(employeeDto, Employee.class);

        // Save Employee
        employeeRepository.save(employee);

        return employeeDto;
    }

    @Override
    public EmployeeResponse getEmployeeById(Long id) {
        // Get employee by ID
        Employee employee  = employeeRepository.findById(id).get();

        // Map Employee entity to EmployeeDto
        EmployeeDto employeeDto = modelMapper.map(employee, EmployeeDto.class);

        // Call department microservice by RestTemplate
        ResponseEntity<DepartmentDto> responseEntity =  restTemplate.getForEntity("http://localhost:8080/api/departments/" + employeeDto.getDepartmentCode(), DepartmentDto.class);
        DepartmentDto departmentDto = responseEntity.getBody();
        
        // Prepare employee response
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setEmployeeDto(employeeDto);
        employeeResponse.setDepartmentDto(departmentDto);

        return employeeResponse;
    }
    
}
