package bank;

import framework.*;

public class PersonalCheckingAccount extends PersonalAccount {

	public PersonalCheckingAccount(ICustomer customer, String accountID) {
		super(customer, accountID);
	}

	@Override
	public void excecuteOperation(IOperation operation) {
		operation.excecute();
	}


}
