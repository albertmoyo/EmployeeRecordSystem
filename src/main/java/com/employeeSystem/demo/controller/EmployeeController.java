package com.employeeSystem.demo.controller;

import com.employeeSystem.demo.domain.Employee;
import com.employeeSystem.demo.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/employee")
@Slf4j

public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        if(employee.getStatus() == 0){
            // TODO: 2021/09/02  
            return ResponseEntity.badRequest().body(employee);
        }
        log.info("Creating employee: {}", employee);
        return ResponseEntity.ok(employeeService.saveEmployee(employee));
    }

    @GetMapping(value = "/employee/{employeeId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable(value = "employeeId") long employeeId) {
        log.info("Getting employee with id: {}", employeeId);
        return ResponseEntity.ok(employeeService.getEmployeeById(employeeId));
    }

    @GetMapping(value = "/employees")
    public ResponseEntity<List<Employee>> getEmployees() {
        log.info("Fetching all employees");
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping(value = "/getEmployeesSearchByName/{fistName}")
    public ResponseEntity<List<Employee>> getEmployeesSearchByName(@PathVariable(value = "fistName") String firstName) {
        log.info("Searching all employees with firstName: {}", firstName);
        return ResponseEntity.ok(employeeService.findEmployeeByName(firstName));
    }

    @DeleteMapping(value = "/deleteEmployee/{employeeId}")
    public String deleteEmployeeById(@PathVariable long employeeId) {
        log.info("Deleting employee by id: {} ", employeeId);
        employeeService.deleteEmployee(employeeId);
        return "Delete successful!";
    }

    @PutMapping(value = "/editEmployee")
    public ResponseEntity<Employee> editEmployees(@RequestBody Employee employee) {
        log.info("Editing employee: {}", employee);
        return ResponseEntity.ok(employeeService.editEmployee(employee));
    }

}
