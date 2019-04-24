package framework_old2;
import java.util.ArrayList;
import java.util.List;

public abstract class AAccount implements IAccount {

	private String accountID;
	private double balance;
	private ICustomer customer;
	private IOperation operation;
	
	public AAccount(ICustomer customer, String accountID) {
		super();
		this.accountID = accountID;
		this.balance = 0;
		this.customer = customer;
	}
	public ICustomer getCustomer() {
		return customer;
	}
	
	public void addOperation(IOperation operation) {
		this.operation = operation;
	}
	
	
	public boolean updateBalance(double amount) {
		// TODO Auto-generated method stub
		if(balance + amount < 0 )
			return false;
		balance += amount;
		return true;
	}
	public double getBalance() {
		return balance;
	}
	public String getAccountID() {
		return accountID;
	}

}
