package com.navin.springbootwebtutorial.springbootwebtutorial.controllers;

import com.navin.springbootwebtutorial.springbootwebtutorial.dto.EmployeeDTO;
import com.navin.springbootwebtutorial.springbootwebtutorial.entities.EmployeeEntity;
import com.navin.springbootwebtutorial.springbootwebtutorial.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService; // Constructor Injection
    }

    @GetMapping("/{employeeId}")
    public EmployeeDTO findEmployeeById(@PathVariable Long employeeId) {
        return employeeService.findEmployeeById(employeeId);
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees(@RequestParam(required = false, name = "inputAge") Integer age) {
        return employeeService.findAllEmployees();
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.createEmployee(employeeDTO);
    }
}
