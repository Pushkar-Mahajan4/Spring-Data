package com.crud.CRUD.OP.Repository;

import com.crud.CRUD.OP.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// JPA API Method --> Long and Tedious, less loosely coupled
//public interface EmployeeRepo {
//    List<Employee> findAll();
//    List<Employee> addEmployee(Employee addEmployee);
//}



// You don't need an Impl for this so commenting Impl

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
    List<Employee> findAll();
}




// According to Udemy @Service, @Repository should be applied on Impl Class and not
// on the interface


// Now to do this in Spring data JPA we do:

//public interface EmployeeRepo extends JpaRepository<`Entity Name here`, `Primary Key data type here`>{}

// This is how modern Youtube did it...
//@Repository
//public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
//}
