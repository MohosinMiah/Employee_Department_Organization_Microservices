package com.employee.employeeservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.employee.employeeservice.dto.DepartmentDto;

// @FeignClient(url = "http://localhost:8080", value ="DEPARTMENT-SERVICE")
@FeignClient(name = "DEPARTMENT-SERVICE")
public interface APIClient {

    // Build Get Department By ID Rest API
    @GetMapping("api/departments/{department-code}")
    public DepartmentDto getDepartmentByCode(@PathVariable("department-code") String code );
}
