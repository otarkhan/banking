package bank;

import framework.*;

public class PersonalSavingAccount extends PersonalAccount {

	public PersonalSavingAccount(ICustomer customer, String accountID) {
		super(customer,accountID);
	}

	@Override
	public void excecuteOperation(IOperation operation) {
		operation.excecute();
	}

//	@Override
//	public void addInterest() {
//		IOperation op = new Interest(accountList, 0.1);//interestRate);
//		op.excecute();
//	}

}
