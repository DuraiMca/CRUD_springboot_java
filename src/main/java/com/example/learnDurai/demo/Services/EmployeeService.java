package com.example.learnDurai.demo.Services;

import java.util.List;

import com.example.learnDurai.demo.Model.Employee;

public interface EmployeeService {
     Employee saveEmployee(Employee employee);
     List<Employee> getEmployee();
}
