package com.employee.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {
    private int id;
    private String departmentName;
    private String departmentDescription;
    private String departmentCode;
}
