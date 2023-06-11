package com.department.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.departmentservice.dto.DepartmentDto;
import com.department.departmentservice.service.DepartmentService;


@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
    

    @Autowired
    private DepartmentService departmentService;

    // Build Save Department Rest API Endpoint
    @PostMapping
    public ResponseEntity<DepartmentDto> savDepartment(@RequestBody DepartmentDto departmentDto)
    {
        DepartmentDto savDepartment =  departmentService.savDepartment(departmentDto);

        return new ResponseEntity<>(savDepartment,HttpStatus.CREATED);
    }

    // Build Get Department By ID Rest API
    @GetMapping("{department-code}")
    public ResponseEntity<DepartmentDto> getDepartmentByCode(@PathVariable("department-code") String code )
    {
        DepartmentDto department = departmentService.findByDepartmentCode(code);

        return new ResponseEntity<>(department,HttpStatus.OK);
    }


}
