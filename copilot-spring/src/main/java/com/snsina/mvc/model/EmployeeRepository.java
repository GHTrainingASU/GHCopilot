// create EmployeeRepository JPA repository interface manging Employee entity class in the same package
package com.snsina.mvc.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}


// Path: src/main/java/com/snsina/mvc/model/EmployeeRepository.java