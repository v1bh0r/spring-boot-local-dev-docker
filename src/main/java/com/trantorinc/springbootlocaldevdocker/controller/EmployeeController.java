package com.trantorinc.springbootlocaldevdocker.controller;

import com.trantorinc.springbootlocaldevdocker.jpa.EmployeeRepository;
import com.trantorinc.springbootlocaldevdocker.model.Employee;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees/")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeRepository employeeRepository;

    @GetMapping(path= "/", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<List<Employee>> getAll() {
        return ResponseEntity.ok(employeeRepository.findAll());
    }

    @PostMapping(path = "/",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<Employee> create(@RequestBody Employee employee) {
        var createdEmployee = employeeRepository.save(employee);
        return ResponseEntity.ok(createdEmployee);
    }
}
