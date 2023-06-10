package com.department.departmentservice.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.departmentservice.dto.DepartmentDto;
import com.department.departmentservice.entity.Department;
import com.department.departmentservice.repository.DepartmentRepository;
import com.department.departmentservice.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    private ModelMapper modelMapper;

    
    @Override
    public DepartmentDto savDepartment(DepartmentDto departmentDto) {

        Department department = modelMapper.map(departmentDto, Department.class);
        // Save Department
        department =  departmentRepository.save(department);

        return departmentDto;
    }


    @Override
    public DepartmentDto findByDepartmentCode(String code) {

        // Find Department By Code
        Department department = departmentRepository.findByDepartmentCode(code);

        // Map Department entity to DepartmentDto 
        DepartmentDto departmentDto = modelMapper.map(department,DepartmentDto.class);

        return departmentDto;
    }
    
}
