package com.department.departmentservice.service;

import com.department.departmentservice.dto.DepartmentDto;

public interface DepartmentService {
    public DepartmentDto savDepartment(DepartmentDto departmentDto);

    public DepartmentDto findByDepartmentCode(String code);
}
