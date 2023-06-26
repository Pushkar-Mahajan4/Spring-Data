package com.crud.CRUD.OP.Service;

import com.crud.CRUD.OP.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    List<Employee> addEmployee(Employee addEmployee);
}
