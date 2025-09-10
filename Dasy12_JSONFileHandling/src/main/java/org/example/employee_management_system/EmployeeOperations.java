package org.example.employee_management_system;

import java.util.ArrayList;
import java.util.List;

public class EmployeeOperations {
    List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Employee is cannot be null");
        }
        employees.add(employee);
    }

    private void addEmployeeToJSON(){

    }
}
