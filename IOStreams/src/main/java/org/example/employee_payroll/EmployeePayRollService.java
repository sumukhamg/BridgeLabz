package org.example.employee_payroll;

import java.util.Scanner;

public class EmployeePayRollService {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee id");
        int id = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter employee name:");
        String name = scan.nextLine();

        System.out.println("Enter salary:");
        int salary = scan.nextInt();
        EmployeePayRoll employee = new EmployeePayRoll(id, name, salary);

        System.out.println("Employee Payroll Details");
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());
    }

}
