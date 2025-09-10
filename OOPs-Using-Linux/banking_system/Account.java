public class Account{
	private int balance;
	private long acNo;

	Account(long acNo){
		this.acNo = acNo;
	}

	public int getBalance(){
		return balance;
	}

	public long getAcNo(){
		return acNo;
	}

	public void deposite(int amount){
		if(amount <= 0)
			System.out.println("Enter a valid amount");
		else{
			balance += amount;
			System.out.println("Deposiite successfull");
			System.out.println("Avalilable balance: " + balance);
		}
	}
	public void withdraw(int amount){
		if(amount <= 0)
			System.out.println("Enter a valid amount");
		else if(amount > balance)
			System.out.println("Insufficient balance");
		else{
			balance -= amount;
			System.out.println("Withdraw successfull");
			System.out.println("Avaiilable balance: " + balance);
		}

 
	}
}
