package org.example.employee_payroll;

public class EmployeePayRoll {
    private int id;
    private String name;
    private int salary;

    public EmployeePayRoll(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
