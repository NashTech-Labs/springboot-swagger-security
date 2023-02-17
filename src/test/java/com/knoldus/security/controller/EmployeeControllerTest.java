package com.knoldus.security.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import com.knoldus.security.model.Employee;
import org.junit.jupiter.api.Test;

class EmployeeControllerTest {
    /**
     * Method under test: {@link EmployeeController#firstPage()}
     */
    @Test
    void testFirstPage() {
        assertEquals(2, (new EmployeeController()).firstPage().size());
    }

    /**
     * Method under test: {@link EmployeeController#delete(int)}
     */
    @Test
    void testDelete() {
        assertNull((new EmployeeController()).delete(1));
    }

    /**
     * Method under test: {@link EmployeeController#create(Employee)}
     */
    @Test
    void testCreate() {
        EmployeeController employeeController = new EmployeeController();

        Employee employee = new Employee();
        employee.setDesignation("Designation");
        employee.setEmpId("42");
        employee.setName("Name");
        employee.setSalary(10.0d);
        assertSame(employee, employeeController.create(employee));
    }
}

