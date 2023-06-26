//package com.crud.CRUD.OP.Repository;
//
//import com.crud.CRUD.OP.Entity.Employee;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.TypedQuery;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//
//@Repository
//public class EmployeeRepoImpl implements EmployeeRepo{
//
//    // Define field for Entity manager
//    private EntityManager entityManager;
//
//    // Setup constructor Injection
//    @Autowired
//    public EmployeeRepoImpl(EntityManager theEntityManager){
//        entityManager = theEntityManager;
//    }
//    @Override
//    public List<Employee> findAll() {
//
//        // Write query here
//        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
//
//
//        // Here we write a manual query to find All items in Employee table
//        List<Employee> employees = theQuery.getResultList();
//
//
//        // return the results
//        return employees;
//
//    }
//
//    @Override
//    public List<Employee> addEmployee(Employee addEmployee){
//        entityManager.merge(addEmployee);
//        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
//        return theQuery.getResultList();
//    }
//
//}
