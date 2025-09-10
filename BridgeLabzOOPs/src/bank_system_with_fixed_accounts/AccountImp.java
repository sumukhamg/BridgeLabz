package bank_system_with_fixed_accounts;

public class AccountImp implements Account {
    private int balance = 0;
    public String ownerName;
    private long acNo;

    AccountImp(String ownerName, long acNo) {
        this(ownerName);
        this.acNo = acNo;
    }

    AccountImp(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return acNo;
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

    public void transfer(Account toAc, int amount) {

        if (amount < 0) {
            System.out.println("Invalid amount");
            return;
        }

        if (this.balance < amount) {
            System.out.println("Insufficient balance");
            System.out.println("(" + balance + ")");
            return;
        }
        this.balance -= amount;
        ((AccountImp) toAc).balance += amount;
        System.out.println("Transfer successfull");
        System.out.println("Available balance: " + balance);

    }

    public void showDetails() {
        System.out.println("----Account Details----");
        System.out.println("Holder Name: " + ownerName);
        System.out.println("Holder Account number: " + acNo);
        System.out.println("Total availablle balance: " + balance);
    }

}
