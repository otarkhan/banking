package bank;

import framework.ICustomer;

public abstract class CompanyAccount extends BankAccount {

	public CompanyAccount(ICustomer customer, String accountID) {
		super(customer, accountID);
	}

}
