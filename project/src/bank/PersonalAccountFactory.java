package bank;
import framework.*;

public class PersonalAccountFactory extends AccountFactory {
	public BankAccount createCheckingAccount(ICustomer customer, String accountID) {
		return new PersonalCheckingAccount(customer, accountID);
	}
	public BankAccount createSavingAccount(ICustomer customer, String accountID) {
		return new PersonalSavingAccount(customer, accountID);
	}
}
