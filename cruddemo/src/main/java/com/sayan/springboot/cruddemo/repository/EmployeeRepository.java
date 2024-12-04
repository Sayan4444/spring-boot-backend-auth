package com.sayan.springboot.cruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sayan.springboot.cruddemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

}
