package employee_salary_calculation;

public class App {

    public static void main(String[] args) {
        FulltimeEmployee fuelEngine1 = new FulltimeEmployee(10000);
        PartTimeEmployee petroleEngine1 = new PartTimeEmployee(5000);
        fuelEngine1.calculateSalary();
        petroleEngine1.calculateSalary();
    }
}
