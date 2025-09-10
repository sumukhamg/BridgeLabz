package bank_system_with_fixed_accounts;

interface Account {
    void deposite(int amount);

    void withdraw(int amount);

    void transfer(Account toAc, int amount);

}