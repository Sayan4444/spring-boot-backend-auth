package com.sayan.springboot.cruddemo.service;

import java.util.List;

import com.sayan.springboot.cruddemo.model.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
