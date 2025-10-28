package com.navin.springbootwebtutorial.springbootwebtutorial.services;

import com.navin.springbootwebtutorial.springbootwebtutorial.dto.EmployeeDTO;
import com.navin.springbootwebtutorial.springbootwebtutorial.entities.EmployeeEntity;
import com.navin.springbootwebtutorial.springbootwebtutorial.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public List<EmployeeDTO> findAllEmployees() {
        List<EmployeeEntity> employeeEntityList = employeeRepository.findAll();
        return employeeEntityList
                .stream()
                .map(employeeEntity -> modelMapper.map(employeeEntity, EmployeeDTO.class))
                .collect(Collectors.toList());
    }

    public EmployeeDTO findEmployeeById(Long Id) {
        EmployeeEntity employeeEntity = employeeRepository.findById(Id).orElse(null);
        return modelMapper.map(employeeEntity, EmployeeDTO.class);
    }

    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntityToSave = modelMapper.map(employeeDTO, EmployeeEntity.class);
        EmployeeEntity savedEmployeeEntity = employeeRepository.save(employeeEntityToSave);
        return modelMapper.map(savedEmployeeEntity, EmployeeDTO.class);
    }
}
