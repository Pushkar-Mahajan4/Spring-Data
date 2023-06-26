package com.crud.CRUD.OP;

import com.crud.CRUD.OP.Entity.Employee;
import com.crud.CRUD.OP.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CrudOpApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudOpApplication.class, args);
//		Employee employee = new Employee("Pushkar", "Mahajan", "Harrison", "9817281789");

	}

}
