package com.crud.CRUD.OP.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Random;

@Entity
@Table(name="employee")
public class Employee {
    public Employee() {
    }

    @Id
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCity() {
        return city;
    }



    public void setCity(String city) {
        this.city = city;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Employee(String first_name, String last_name, String city, String contact) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.city = city;
        this.contact = contact;
    }

    private String first_name;
    private String last_name;
    private String city;
    private String contact;


    @Override
    public String toString() {
        return "Employee{" +
                ", ID=" + ID +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", city='" + city + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
