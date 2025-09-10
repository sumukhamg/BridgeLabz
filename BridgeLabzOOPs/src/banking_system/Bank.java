package banking_system;

public class Bank {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Sumukh", 111111111, 20);
        Customer customer2 = new Customer("Suresh", 222222222, 18);
        Customer customer3 = new Customer("Ramesh", 777777777, 28);
        Customer customer4 = new Customer("Mahesh", 888888888, 20);

        customer1.account.deposite(10000);
        customer1.account.withdraw(2000);
        System.out.println(customer1.accountNumber);
        System.out.println(customer1.account.getBalance());

        customer2.account.deposite(60000);
        customer2.account.withdraw(7000);
        System.out.println(customer2.accountNumber);
        System.out.println(customer2.account.getBalance());

        customer3.account.deposite(30000);
        System.out.println(customer3.accountNumber);
        customer3.account.withdraw(2500);
        System.out.println(customer3.account.getBalance());

        customer4.account.deposite(1000);
        System.out.println(customer4.accountNumber);
        customer4.account.withdraw(200);
        System.out.println(customer4.account.getBalance());

    }

}
