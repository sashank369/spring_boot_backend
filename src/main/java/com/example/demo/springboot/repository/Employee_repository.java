package com.example.demo.springboot.repository;

import com.example.demo.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Employee_repository extends JpaRepository<Employee, Long> {
    @Override
    List<Employee> findAll();
}
