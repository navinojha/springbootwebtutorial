package com.navin.springbootwebtutorial.springbootwebtutorial.controllers;

import com.navin.springbootwebtutorial.springbootwebtutorial.dto.EmployeeDTO;
import com.navin.springbootwebtutorial.springbootwebtutorial.entities.EmployeeEntity;
import com.navin.springbootwebtutorial.springbootwebtutorial.repositories.EmployeeRepository;
import com.navin.springbootwebtutorial.springbootwebtutorial.services.EmployeeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import java.time.LocalDate;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService; // Constructor Injection
    }

//    @GetMapping("/getSecretMessage")
//    public String getMySecretMessage(){
//        return "Hello From Navin";
//    }
    @GetMapping("/{employeeId}")
    public EmployeeEntity findEmployeeById(@PathVariable Long employeeId){
        return employeeService.findEmployeeById(employeeId);
    }

    @GetMapping("/employees")
    public List<EmployeeEntity> getAllEmployees(@RequestParam(required = false, name="inputAge") Integer age){
        return employeeService.findAllEmployees();
    }

    @PostMapping("/employees")
    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity employeeDTO){
        return employeeService.createEmployee(employeeDTO);
    }
}
