package framework_old;
import java.util.List;

public class Deposit extends AOperation {
	
	private String ID;
	private double amount;
	private double oldBalance;
	private double newBalance;

	public Deposit(List<IAccount> accountList, String iD, double amount) {
		super(accountList);
		ID = iD;
		this.amount = amount;
	}

	@Override
	public void excecute() {
		// TODO Auto-generated method stub
		for(IAccount account : super.getAccountList()) {
			if(account.getAccountID().equals(ID)) {
				oldBalance = account.getBalance();
				account.updateBalance(amount);
				newBalance = account.getBalance();
				super.getRecordList().add(new Record(this.getClass().getSimpleName(),oldBalance, amount, newBalance));
			}
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
