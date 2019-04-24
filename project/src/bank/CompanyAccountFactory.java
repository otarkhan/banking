package bank;

import framework.*;

public class CompanyAccountFactory extends AccountFactory {
	public BankAccount createCheckingAccount(ICustomer customer, String accountID) {
		return new CompanyCheckingAccount(customer, accountID);
	}

	@Override
	public BankAccount createSavingAccount(ICustomer customer, String accountID) {
		return new CompanySavingAccount(customer, accountID);
	}
}
