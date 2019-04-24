package bank;

import framework.ICustomer;

public abstract class PersonalAccount extends BankAccount {

	public PersonalAccount(ICustomer customer, String accountID) {
		super(customer, accountID);
	}

}
