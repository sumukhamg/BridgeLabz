package mini_atm.java;

public class ATM implements ATMImpl {

    private int balance = 0;
    public String ownerName;
    private int pin;

    ATM(String ownerName, int pin) {
        this.pin = pin;
        this.ownerName = ownerName;
    }

    public int getPIN() {
        return pin;
    }

    public int getBalance() {
        return balance;
    }

    public void deposite(int amount) {
        if (amount < 0) {
            System.out.println("Invalid amount entered!");
            return;
        }
        balance += amount;
        System.out.println("Deposite successfull.");
        System.out.println("Available balance: " + balance);
    }

    public void withdraw(int amount) {
        if (amount < 0) {
            System.out.println("Invalid amount entered!");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }

        balance -= amount;
        System.out.println("Withdraw successufll.");
        System.out.println("Available balance: " + balance);
    }

    public void showDetails() {
        System.out.println("----Account Details----");
        System.out.println("Holder Name: " + ownerName);
        System.out.println("Total availablle balance: " + balance);
    }

}
