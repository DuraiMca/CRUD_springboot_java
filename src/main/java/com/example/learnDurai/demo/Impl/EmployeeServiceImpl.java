package com.example.learnDurai.demo.Impl;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.learnDurai.demo.EmployeeRepository;
import com.example.learnDurai.demo.Model.Employee;
import com.example.learnDurai.demo.Services.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public Employee saveEmployee(Employee employee) {
        
        return employeeRepository.save(employee);
    }
    @Override
    public List<Employee> getEmployee() {
        
        return employeeRepository.findAll();
    }
   
    
}
