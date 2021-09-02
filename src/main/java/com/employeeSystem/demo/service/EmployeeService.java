package com.employeeSystem.demo.service;

import com.employeeSystem.demo.domain.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    Employee getEmployeeById(long employeeId);

    List<Employee> getAllEmployees();

    Employee editEmployee(Employee employee);

    void deleteEmployee(long employeeId);

    List<Employee> findEmployeeByName(String firstName);

}
