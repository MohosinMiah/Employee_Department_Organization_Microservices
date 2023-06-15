package com.employee.employeeservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/api/employees")
public class MyMessageController {
    
    @Value("${spring.boot.message}")
    private String $message;

    @GetMapping("/user/message")
    public String message()
    {
        return $message;
    }
}
