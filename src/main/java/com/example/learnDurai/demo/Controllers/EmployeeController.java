package com.example.learnDurai.demo.Controllers;



import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnDurai.demo.Services.*;
import com.example.learnDurai.demo.Model.*;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {
    
  EmployeeService employeeService;


  public EmployeeController(EmployeeService employeeService) {
    
    this.employeeService = employeeService;
}


@PostMapping()
  public ResponseEntity<Employee> savEmployee(@RequestBody Employee employee){

    return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);

  }
     


  @GetMapping()
  public List<Employee> getEmp(){
    return employeeService.getEmployee();
  }

}
