package com.employeeSystem.demo.service;

import com.employeeSystem.demo.domain.Employee;
import com.employeeSystem.demo.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeServiceBean implements EmployeeService{
    private final EmployeeRepository employeeRepository;


    @Autowired
    public EmployeeServiceBean(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long employeeId) {
        return employeeRepository.getById(employeeId);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee editEmployee(Employee employee) {
        return employeeRepository.saveAndFlush(employee);
    }

    @Override
    public void deleteEmployee(long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public List<Employee> findEmployeeByName(String firstName) {
        return employeeRepository.findByFirstNameIs(firstName);
    }
}
