package mini_atm.java;

import java.util.Scanner;

public class Users {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, accountselected;

        ATM account1 = new ATM("Sumukha MG", 1234);
        ATM account2 = new ATM("Sudeep", 2345);
        ATM account3 = new ATM("Suraj", 3456);
        ATM account4 = new ATM("Sumanth", 5678);
        ATM account5 = new ATM("Suhas", 6789);
        ATM account6 = new ATM("Suresh", 7890);

        ATM[] accounts = { account1, account2, account3, account4, account5, account6 };

        System.out.println("Total Accounts created: ");
        for (int i = 0; i < accounts.length; i++) {
            System.out.println((i + 1) + accounts[i].ownerName);
        }

        while (true) {

            System.out.println("Which operation you need to perform?");
            System.out.println("1.Account Details");
            System.out.println("2.Deposite amount");
            System.out.println("3.withdraw amount");
            System.out.println("4.Exit");

            choice = sc.nextInt();
            System.out.println("Select account: ");
            accountselected = sc.nextInt();

            System.out.println("Enter password");
            int pin = sc.nextInt();
            int attempt = 5;

            while (pin != accounts[accountselected - 1].getPIN() && attempt > 0) {
                System.out.println("Invalid PIN. Enter again");
                pin = sc.nextInt();
                System.out.println("Total attempt left: " + attempt);
                attempt--;
            }
            if (attempt == 0) {
                System.out.println("Sorry 5 attempts completed. Cannot process further.");
                return;
            }

            switch (choice) {
                case 1:
                    accounts[accountselected - 1].showDetails();
                    break;

                case 2:
                    System.out.println("Enter amount: ");
                    int amount = sc.nextInt();
                    accounts[accountselected - 1].deposite(amount);
                    break;

                case 3:
                    System.out.println("Enter amount: ");
                    int withdrawAmount = sc.nextInt();
                    accounts[accountselected - 1].withdraw(withdrawAmount);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }

    }
}