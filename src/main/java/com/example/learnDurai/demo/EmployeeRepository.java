package com.example.learnDurai.demo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learnDurai.demo.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    
}
