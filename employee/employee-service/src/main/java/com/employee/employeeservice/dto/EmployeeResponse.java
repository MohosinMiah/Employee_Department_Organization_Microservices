package com.employee.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
    private DepartmentDto departmentDto;
    private EmployeeDto employeeDto;
}
