package com.ourfirstapp.first_spring_app.model;

public class Employee {
    public int id;
    public String Name;
    public String Email;
    public Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //Constructor Injection-Defining values to the instance variables using Constructor.
    public Employee(){}
    public Employee(int id, String name, String email, Address address) {
        this.id = id;
        Name = name;
        Email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
