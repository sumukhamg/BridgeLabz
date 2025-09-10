import java.util.Scanner;
public class Bank{
	 public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		System.out.println(i);
		Customer customer1 = new Customer("Sumukh MG", 111111, 20);
		Customer customer2 = new Customer("Sudeep", 22222, 28);
		customer1.account.deposite(1000);
		customer2.account.withdraw(100);

		System.out.println("Customer1 balance: " + customer1.account.getBalance());
		System.out.println("Customer2 balance: " + customer2.account.getBalance());

	}
}
