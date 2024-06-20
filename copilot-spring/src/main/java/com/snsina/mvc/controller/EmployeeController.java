package com.snsina.mvc.controller;

// create a controller class EmployeeController with @RestController
// @RestController: mark this class as a controller class
// @RequestMapping: map this class to a path named /employees
// Return value from Employee entity class
// @Autowired: inject the EmployeeRepository bean

import com.snsina.mvc.model.Employee;
import com.snsina.mvc.model.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")

public class EmployeeController {

    @Autowired
    // create EmployeeRepository bean



    private EmployeeRepository employeeRepository;

    // create a method to return all employees
    // @GetMapping: map this method to a HTTP GET request
    // @ResponseBody: return the data as the response body
    // @RequestMapping: map this method to a path named /all
    // Return value from Employee entity class
    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // create a method to return an employee by id
    // @GetMapping: map this method to a HTTP GET request
    // @ResponseBody: return the data as the response body
    // @RequestMapping: map this method to a path named /find/{id}
    // Return value from Employee entity class
    @GetMapping("/find/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable("id") Long id) {
        return employeeRepository.findById(id);
    }

    // create a method to add an employee
    // @PostMapping: map this method to a HTTP POST request
    // @ResponseBody: return the data as the response body
    // @RequestMapping: map this method to a path named /add
    // Request body from Employee entity class
    // Return value from Employee entity class
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    // create a method to update an employee
    // @PutMapping: map this method to a HTTP PUT request
    // @ResponseBody: return the data as the response body
    // @RequestMapping: map this method to a path named /update
    // Request body from Employee entity class
    // Return value from Employee entity class
    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    // create a method to delete an employee by id
    // @DeleteMapping: map this method to a HTTP DELETE request
    // @ResponseBody: return the data as the response body
    // @RequestMapping: map this method to a path named /delete/{id}
    // Return value from Employee entity class

    // generate test for this method
    @DeleteMapping("/delete/{id}")
    public String deleteEmployeeById(@PathVariable("id") Long id) {
        employeeRepository.deleteById(id);
        return "Employee deleted successfully";
    }



}