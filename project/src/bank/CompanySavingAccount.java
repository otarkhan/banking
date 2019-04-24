package bank;

import framework.*;

public class CompanySavingAccount extends CompanyAccount {

	public CompanySavingAccount(ICustomer customer, String accountID) {
		super(customer, accountID);
	}

	@Override
	public void excecuteOperation(IOperation operation) {
		operation.excecute();
	}

	

}
