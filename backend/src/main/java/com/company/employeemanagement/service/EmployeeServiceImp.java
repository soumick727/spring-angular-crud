package com.company.employeemanagement.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.employeemanagement.model.Employee;
import com.company.employeemanagement.repository.EmployeeRepo;


@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepo.findById(id).orElse(null);
    }

    

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        if(employeeRepo.existsById(id)){
            employee.setId(id);
            return employeeRepo.save(employee);
        }
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {
        Employee existing = getEmployeeById(id);
        employeeRepo.delete(existing);
    }

    
}
