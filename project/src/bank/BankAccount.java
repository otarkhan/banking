package bank;
import framework.*;

public abstract class BankAccount extends AAccount{
	private int accountNumber;
	private double balance;

	public BankAccount(ICustomer customer, String accountID) {
		super(customer, accountID);
	}
	
//	public abstract void addInterest();

//	public void withdrawFromAccount(double amount) {//accountList
//		//IOperation op = new Withdraw(null, Integer.toString(accountNumber), amount);
//		//op.excecute();
//	}
//
//	public void depositToAccount(double amount) {
//		IOperation op = new Deposit(null, Integer.toString(accountNumber), amount);
//	}


}
