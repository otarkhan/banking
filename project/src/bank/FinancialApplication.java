package bank;

import java.util.List;
import framework.*;

public class FinancialApplication extends AFinancialApplication{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ICustomer cus1 = new Customer(123456,"John","Wick","jw@gmail.com","100 n 4 street","fairfield,","iowa",52557);
		ICustomer cus2 = new Customer(123456,"Ally","Ahu","jw@gmail.com","100 n 4 street","fairfield,","iowa",52557);
		ICustomer cus3 = new Customer(123456,"Mop","Aho","jw@gmail.com","100 n 4 street","fairfield,","iowa",52557);
		ICustomer cus4 = new Customer(123456,"Wop","Ahi","jw@gmail.com","100 n 4 street","fairfield,","iowa",52557);
		
		
		IAccount acc1 = new Account(cus1,"00001");
		IAccount acc2 = new Account(cus1,"00002");
		IAccount acc3 = new Account(cus1,"00003");
		IAccount acc4 = new Account(cus1,"00004");
		
		IFinancialApplication finApp = new FinancialApplication();
		
		finApp.addAccount(acc1);
		finApp.addAccount(acc2);
		finApp.addAccount(acc3);
		finApp.addAccount(acc4);

		IOperation operation1 = new Deposit(finApp.getAccountList(), "00001", 200);
		operation1.excecute();
		IOperation operation2 = new Deposit(finApp.getAccountList(), "00002", 2545);
		operation2.excecute();
		IOperation operation3 = new Deposit(finApp.getAccountList(), "00004", 2047540);
		operation3.excecute();
		IOperation operation4 = new Deposit(finApp.getAccountList(), "00003", 20540);
		operation4.excecute();
		IOperation operation5 = new Deposit(finApp.getAccountList(), "00003", 212);
		operation5.excecute();
		
		for(IAccount account : finApp.getAccountList()) {
			System.out.println(account.getAccountID() +" "+account.getBalance());
		}
		
		IOperation operation6 = new Withdraw(finApp.getAccountList(), "00001", 200);
		operation6.excecute();
		System.out.println("=----dsaf--sf");
		
		for(IAccount account : finApp.getAccountList()) {
			System.out.println(account.getAccountID() +" "+account.getBalance());
		}
		
		
		
		System.out.println("=----dsaf--sf");

		
//		IOperation operation7 = new Interest(finApp.getAccountList());
//		operation7.excecute();
		
		for(IAccount account : finApp.getAccountList()) {
				System.out.println(account.getAccountID() +" "+account.getBalance());
		}	
		
		
		
		
		
		
		
	}
}
