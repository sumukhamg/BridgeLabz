package bank_system_with_fixed_accounts;

import java.util.Scanner;

public class MainRunner {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice, accountselected;

        AccountImp ac1 = new AccountImp("Sumukha MG", 111111111);
        AccountImp ac2 = new AccountImp("Sudeep", 77777777);
        AccountImp ac3 = new AccountImp("Suraj", 66666666);
        AccountImp ac4 = new AccountImp("Sumanth", 44444444);
        AccountImp ac5 = new AccountImp("Suhas", 33333333);
        AccountImp ac6 = new AccountImp("Suresh", 22222222);

        AccountImp[] accounts = { ac1, ac2, ac3, ac4, ac5, ac6 };

        System.out.println("Total Accounts created: ");
        for (int i = 0; i < accounts.length; i++) {
            System.out.println((i + 1) + accounts[i].ownerName);
        }

        while (true) {

            System.out.println("Which operation you need to perform?");
            System.out.println("1.Account Details");
            System.out.println("2.Deposite amount");
            System.out.println("3.withdraw amount");
            System.out.println("4.Trancefer amount");
            System.out.println("5.Exit");

            choice = sc.nextInt();
            System.out.println("Select account: ");
            accountselected = sc.nextInt();
            if (accountselected >= accounts.length || accountselected <= 0) {
                System.out.println("Invalid Selection");
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
                    System.out.println("Enter reciever account number: ");
                    long acNo = sc.nextLong();
                    System.out.println("Enter amount u want to ");
                    int transferAmount = sc.nextInt();

                    for (int i = 0; i < accounts.length; i++) {
                        if (accounts[i].getAccountNumber() == acNo) {
                            accounts[i].transfer(ac6, transferAmount);
                        }
                        if (i == accounts.length) {
                            System.out.println("Account not found!");
                            break;
                        }
                    }
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }

}
