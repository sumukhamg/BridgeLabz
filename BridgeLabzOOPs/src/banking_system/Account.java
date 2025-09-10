package banking_system;

public class Account {
    private int balance = 0;
    private long accountNumber;

    Account(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public long getAccountnumber() {
        return accountNumber;
    }

    public void deposite(int amount) {
        if (amount < 0) {
            System.out.println("invalid amount entered.");
        } else
            balance += amount;
        System.out.println(balance);
    }

    public void withdraw(int amount) {
        if (amount < 0) {
            System.out.println("Invalid amount entered");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("amount withdraw successfull");
            System.out.println("available balance: " + balance);
        }
    }
}
