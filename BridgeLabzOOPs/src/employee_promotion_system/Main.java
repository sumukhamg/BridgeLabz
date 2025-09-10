package employee_promotion_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeImpl employ1 = new EmployeeImpl(111, "Sumukha", "Developer", 25000, Promotions.JUNIOR);
        EmployeeImpl employ2 = new EmployeeImpl(222, "Sachin", "Tester", 20000, Promotions.MID);
        EmployeeImpl employ3 = new EmployeeImpl(333, "Sumanth", "Tester", 40000, Promotions.SENIOR);
        EmployeeImpl employ4 = new EmployeeImpl(444, "Suhaas", "Developer", 22000, Promotions.LEAD);
        EmployeeImpl employ5 = new EmployeeImpl(555, "Yash", "HR", 25000, Promotions.MID);
        EmployeeImpl[] employees = new EmployeeImpl[5];

        employees[0] = employ1;
        employees[1] = employ2;
        employees[2] = employ3;
        employees[3] = employ4;
        employees[4] = employ5;

        System.out.println("--- All Employees ---");
        for (int i = 0; i < 5; i++) {
            employees[i].display();
        }

        while (true) {
            System.out.println("Which employee you want to promote?");
            int choice = sc.nextInt();
            if (choice > 5) {
                System.out.println("Invalid employee choosen");
                return;
            }

            if (choice <= 5 && choice > 0) {
                employees[choice].promote();
                employees[choice].display();
            }

            System.out.println("You still want to any one?");
            System.out.println("1. For yes\n2. to exit");
            choice = sc.nextInt();

            if (choice == 2)
                return;

        }

    }
}
