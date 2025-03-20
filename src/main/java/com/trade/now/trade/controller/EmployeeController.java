package com.trade.now.trade.controller;

// src/main/java/com/trade/now/trade/EmployeeController.java

import com.trade.now.trade.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1L, "John Doe", 50000.0),
                new Employee(2L, "Jane Smith", 55000.0),
                new Employee(3L, "Jim Brown", 60000.0),
                new Employee(4L, "Jake White", 65000.0),
                new Employee(5L, "Jill Black", 70000.0)
        );
    }
}
