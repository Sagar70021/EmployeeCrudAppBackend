package com.example.EmployeeCrudApp.services;

import com.example.EmployeeCrudApp.model.EmployeeModel;

import java.util.List;

public interface EmployeeService {
    public EmployeeModel createEmployee(EmployeeModel employeeModel);


    List<EmployeeModel> getAllEmployees();

    boolean deleteEmployee(Long id);

    EmployeeModel getEmployeeById(Long id);

    EmployeeModel updateEmployee(Long id, EmployeeModel employeeModel);
}
