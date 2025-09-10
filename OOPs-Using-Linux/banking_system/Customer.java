public class Customer{
	protected int age;
	protected String name;
	protected long accountNumber;

	Customer(String name, long accountNumber, int age){
		this.name = name;
		this.accountNumber = accountNumber;
		this.age = age;
	}

	Account account = new Account(accountNumber);
}
