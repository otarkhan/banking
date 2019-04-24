package framework_old;
import java.util.List;

public class Interest extends AOperation {
	
	private double interestRate = 0.01;
	private double oldBalance;
	private double newBalance;
	

	public Interest(List<IAccount> accountList, double interestRate) {
		super(accountList);
		this.interestRate = interestRate;
	}

	@Override
	public void excecute() {
		// TODO Auto-generated method stub
		for(IAccount account : super.getAccountList()) {
			oldBalance = account.getBalance();
			account.updateBalance(account.getBalance() * interestRate);
			newBalance = account.getBalance();
			super.getRecordList().add(new Record(this.getClass().getSimpleName(),oldBalance, interestRate, newBalance));

		}
	}
	
	@Override
	public String showExcecutionHistory() {
		// TODO Auto-generated method stub
		String history = "";
		for(IRecord record : super.getRecordList()) {
			history+= record.toString();
			}
		return history;
	}


}
