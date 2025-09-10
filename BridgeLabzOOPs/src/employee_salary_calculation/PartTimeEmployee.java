package employee_salary_calculation;

public class PartTimeEmployee implements Employee {
    int salary;

    PartTimeEmployee(int salary) {
        this.salary = salary;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Part time employee works for 10 hours a day");
        System.out.println("Salary of a part timee employee: " + salary * 10 + " per day");
    }

}
