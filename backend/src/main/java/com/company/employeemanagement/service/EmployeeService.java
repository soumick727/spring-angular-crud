package com.company.employeemanagement.service;

import java.util.List;

import com.company.employeemanagement.model.Employee;

public interface EmployeeService {
Employee createEmployee(Employee employee);
Employee getEmployeeById(Long id);
List<Employee> getAllEmployees();
Employee updateEmployee(Long id, Employee employee);
Boolean deleteEmployee(Long id);
}
