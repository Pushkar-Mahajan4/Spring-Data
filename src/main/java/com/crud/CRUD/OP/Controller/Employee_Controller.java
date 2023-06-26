package com.crud.CRUD.OP.Controller;


import com.crud.CRUD.OP.Entity.Employee;
import com.crud.CRUD.OP.Repository.EmployeeRepo;
import com.crud.CRUD.OP.Service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class Employee_Controller {
    // Dirty method of quick injecting
    // private EmployeeRepo employeeRepo;

    // Now that we have added Service Layer, we can use that to access DAO/Repo
    private EmployeeService employeeService;


    public  Employee_Controller(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    @GetMapping("/all")
    private List<Employee> findAll(){
        return employeeService.findAll();
    }

    @PostMapping("/add")
    private List<Employee> addEmployee(@RequestBody Employee addEmployee){
        return employeeService.addEmployee(addEmployee);
    }

}
