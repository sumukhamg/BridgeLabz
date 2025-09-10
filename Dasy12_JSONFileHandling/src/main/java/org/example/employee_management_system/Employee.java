package org.example.employee_management_system;

public class Employee {
    private int id;
    private String name;
    private String department;
    private Address address;
    private Project project;

    public Employee(int id, String name, String department, Address address, Project project) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.address = address;
        this.project = project;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Address getAddress() {
        return address;
    }

    public Project getProject() {
        return project;
    }
}
