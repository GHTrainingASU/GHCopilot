package com.snsina.mvc.controller;

// create a test class for controller EmployeeController
// @SpringBootTest: mark this class as a test class
// @AutoConfigureMockMvc: auto-configure MockMvc
// @Autowired: inject MockMvc bean
// @MockBean: mock EmployeeRepository bean
// @Test: mark this method as a test method
// @WithMockUser: mock a user
// @WithMockUser: mock a user
// @WithMockUser: mock a user
// @WithMockUser: mock a user

import com.snsina.mvc.model.Employee;
import com.snsina.mvc.model.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeControllerTest {

        @Autowired
        private EmployeeController employeeController;

        @Autowired
        EmployeeRepository employeeRepository;

        @BeforeEach
        public void setUp() {
                employeeRepository.deleteAll();
        }


        // test all employees
        // @Test: mark this method as a test method
        @Test
        public void testGetAllEmployees() throws Exception {
                // create an employee
                Employee employee = new Employee("Siavash", "snsina", (int) 1.00, 1.00);
                Employee employee1 = new Employee("Matt", "matt@gmail.com", (int) 2.00, 100000.00);
                // save the employee
                employeeRepository.save(employee);

                // add assertions to validate the result
                // assert: assert the expected value is equal to the actual value
                // assertTrue: assert the expected value is true
                // assertFalse: assert the expected value is false
                // assertNotNull: assert the expected value is not null
                assert employeeController.getAllEmployees().size() == 1;
        }








}
