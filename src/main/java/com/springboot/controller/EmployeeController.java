package com.springboot.controller;

import com.springboot.model.Employee;
import com.springboot.repository.Employee_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private Employee_repository employeeRepository;

    //get all employees
    @GetMapping("/employees")
    public List<Employee> getallEmployees(){
        return employeeRepository.findAll();
    }
}
