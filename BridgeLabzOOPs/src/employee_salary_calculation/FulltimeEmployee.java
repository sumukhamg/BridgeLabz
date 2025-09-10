package employee_salary_calculation;

public class FulltimeEmployee implements Employee {
    int salary;

    FulltimeEmployee(int salary) {
        this.salary = salary;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Annual salary of full-time employee: " + salary + "is: " + salary * 12);
    }

}
