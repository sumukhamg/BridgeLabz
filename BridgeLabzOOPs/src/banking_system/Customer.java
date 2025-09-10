package banking_system;

public class Customer {
    String name;
    int age;
    long accountNumber;

    Customer(String name, long accountNumber, int age) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.age = age;
    }

    Account account = new Account(accountNumber);

}
