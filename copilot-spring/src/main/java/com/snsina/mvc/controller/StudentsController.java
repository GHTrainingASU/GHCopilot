package com.snsina.mvc.controller;

// Create a controller class StudentsController with @RestController
// @RestController: mark this class as a controller class
// @RequestMapping: map this class to a path named /students
// Return value from Students entity class
// @Autowired: inject the StudentsRepository bean

import com.snsina.mvc.model.Students;
import com.snsina.mvc.model.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")

public class StudentsController {

    @Autowired
    // create StudentsRepository bean
    private StudentsRepository studentsRepository;

    // create a method to return all students
    // @GetMapping: map this method to a HTTP GET request
    // @ResponseBody: return the data as the response body
    // @RequestMapping: map this method to a path named /all
    // Return value from Students entity class
    @GetMapping("/all")
    public List<Students> getAllStudents() {
        return studentsRepository.findAll();
    }

    // create a method to return an student by id
    // @GetMapping: map this method to a HTTP GET request
    // @ResponseBody: return the data as the response body
    // @RequestMapping: map this method to a path named /find/{id}
    // Return value from Students entity class
    @GetMapping("/find/{id}")
    public Optional<Students> getStudentsById(@PathVariable("id") Long id) {
        return studentsRepository.findById(id);
    }

    // create a method to add an student
    // @PostMapping: map this method to a HTTP POST request
    // @ResponseBody: return the data as the response body
    // @RequestMapping: map this method to a path named /add
    // Request body from Students entity class
    // Return value from Students entity class
    @PostMapping("/add")
    public Students addStudents(@RequestBody Students students) {
        return studentsRepository.save(students);
    }

    // create a method to update an student
    // @PutMapping: map this method to a HTTP PUT request
    // @ResponseBody: return the data as the response body
    // @RequestMapping: map this method to a path named /update
    // Request body from Students entity class
    // Return value from Students entity class
    @PutMapping("/update")
    public Students updateStudents(@RequestBody Students students) {
        return studentsRepository.save(students);
    }

    // create a method to delete an student by id
    // @DeleteMapping: map this method to a HTTP DELETE request
    // @ResponseBody: return the data as the response body
    //

    // write a java function which takes start date and end date as parameters and calculate working days. It excludes holidays given in a text file


}


