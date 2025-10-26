package com.navin.springbootwebtutorial.springbootwebtutorial.services;

import com.navin.springbootwebtutorial.springbootwebtutorial.entities.EmployeeEntity;
import com.navin.springbootwebtutorial.springbootwebtutorial.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeEntity> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeEntity findEmployeeById(Long Id) {
        return employeeRepository.findById(Id).orElse(null);
    }

    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }
}
