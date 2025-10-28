package CustomException;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) {
        super(msg);
    }
}

class BankAccount {
    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successfull");
            System.out.println("Available balance: " + balance);
        } else {
            throw new InsufficientFundsException("Insufficient balance. Pleace chck your balance");
        }
    }
}

public class CustomException {

    public static void main(String[] args) {
        try {
            BankAccount b1 = new BankAccount(1000);
            b1.withdraw(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
