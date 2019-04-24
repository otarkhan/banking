package bank;

import java.util.List;

import framework.*;


public class BankApplication extends AFinancialApplication{
	IFinancialApplication finApp = new FinancialApplication();
	AccountFactory fact;
	
	public IAccount createPersonalAccount(String accountnr, String clientName, String email, String street, String city,String state, String zip, String accountType,String birthDay)
	{
		fact = AccountCreator.createFactory("Personal");
		ICustomer cust = new Person(clientName, "", email, street, city, state, Integer.parseInt(zip),birthDay);
		IAccount account;
		
		if (accountType == "Ch")
			account = fact.createCheckingAccount(cust, accountnr);
		else
			account = fact.createSavingAccount(cust, accountnr);
//		accountList.add(account);
		finApp.addAccount(account);
		return account;
	}

	public IAccount createCompanyAccount(String accountnr, String clientName, String email, String street, String city,String state, String zip, String accountType, int noEmployees) {
		fact = AccountCreator.createFactory("Company");
		ICustomer cust = new Company(clientName, "", email, street, city, state, Integer.parseInt(zip), noEmployees);
		IAccount account;
		
		if (accountType == "Ch")
			account = fact.createCheckingAccount(cust,accountnr);
		else
			account = fact.createSavingAccount(cust,accountnr);

		finApp.addAccount(account);
		return account;
	}

	public void deposit(String accnr, long deposit) {
		IOperation op = new Deposit(finApp.getAccountList(), accnr, deposit);
		op.excecute();
	}

	public void withdraw(String accnr, long withdraw) {
		IOperation op = new Withdraw(finApp.getAccountList(), accnr, withdraw);
		op.excecute();
	}

	public void addInterest() {
		IOperation op = new Interest(finApp.getAccountList(), 0.1);
		op.excecute();
	}
	
	public double getBalance(String accnr) {
		for(IAccount account : finApp.getAccountList()) {
			if(account.getAccountID().equals(accnr)) {
				return (account.getBalance());
			}
		}
		return 0;
	}


}
