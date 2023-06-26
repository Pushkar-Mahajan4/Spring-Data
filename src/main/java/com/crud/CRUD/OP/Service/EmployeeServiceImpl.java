package com.crud.CRUD.OP.Service;

import com.crud.CRUD.OP.Entity.Employee;
import com.crud.CRUD.OP.Repository.EmployeeRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;


@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepo theEmployeeRepo){
        employeeRepo = theEmployeeRepo;
    }
    @Override
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }


    @Transactional
    @Override
    public List<Employee> addEmployee(Employee theEmployee){
        Random random = new Random();
        int generated_ID = random.nextInt();
        theEmployee.setID(generated_ID < 1 ? generated_ID * -1 : generated_ID);
        employeeRepo.save(theEmployee);
        return employeeRepo.findAll();
    }
}
