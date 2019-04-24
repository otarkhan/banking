package bank;

import framework.*;

public abstract class AccountFactory {

	public abstract BankAccount createCheckingAccount(ICustomer cust, String accountnr);

	public abstract BankAccount createSavingAccount(ICustomer cust, String accountnr);

}
