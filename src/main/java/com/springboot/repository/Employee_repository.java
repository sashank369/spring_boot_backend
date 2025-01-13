package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Employee;

import java.util.List;

@Repository
public interface Employee_repository extends JpaRepository<Employee, Long> {
    @Override
    List<Employee> findAll();
}
