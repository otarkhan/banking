package bank;

import framework.*;

public class CompanyCheckingAccount extends CompanyAccount {

	public CompanyCheckingAccount(ICustomer customer, String accountID) {
		super(customer, accountID);
	}

	@Override
	public void excecuteOperation(IOperation operation) {
		operation.excecute();
	}
}
