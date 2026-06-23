package lab_eval2;

class Account{
	int accNumber;
	double balance;
	
	Account(int accNumber,double balance){
		this.accNumber = accNumber;
		this.balance = balance;
	}
	
	void displayDetails(){
		System.out.println("ID :" + accNumber + "  Balance :" + balance);
	}
}

class SavingsAccount extends Account{
	double interestRate;
	SavingsAccount(int accNumber,double balance,double interestRate){
		super(accNumber,balance);
		this.interestRate = interestRate;
	}
	
	@Override
	void displayDetails(){
		System.out.println("----Savings Account Report----");
		super.displayDetails();
		System.out.println("Annual Interest Rate :" + interestRate + "%");
	}
	
	
}

public class CSE_A {

	public static void main(String[] args) {
		Account A1 = new SavingsAccount(101,25000.0,4.5);
		A1.displayDetails();
	}

}
