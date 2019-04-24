package framework;
import java.util.ArrayList;
import java.util.List;

public class Deposit extends AOperation implements IOperationObservable{
	
	private String ID;
	private double amount;
	private double oldBalance;
	private double newBalance;
	private List<IService> serviceList;

	public Deposit(List<IAccount> accountList, String iD, double amount) {
		super(accountList);
		ID = iD;
		this.amount = amount;
		serviceList = new ArrayList<IService>();
	}

	@Override
	public void excecute() {
		// TODO Auto-generated method stub
		for(IAccount account : super.getAccountList()) {
			if(account.getAccountID().equals(ID)) {
				oldBalance = account.getBalance();
				account.updateBalance(amount);
				newBalance = account.getBalance();
				super.addRecord(new Record(this.getClass().getSimpleName(),oldBalance, amount, newBalance));
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

	@Override
	public void excecute(Predicate predicate) {
		// TODO Auto-generated method stub
		for(IAccount account : super.getAccountList()) {
			if(account.getAccountID().equals(ID) && predicate.test(amount)) {
				IService service = new EmailService();
				this.attach(service);
				this.notifyService(account.getCustomer(),amount);
				this.remove(service);
				oldBalance = account.getBalance();
				account.updateBalance(amount);
				newBalance = account.getBalance();
				super.addRecord(new Record(this.getClass().getSimpleName(),oldBalance, amount, newBalance));
			}
		}
	}

	@Override
	public void attach(IService service) {
		// TODO Auto-generated method stub
		if(service != null) {
			serviceList.add(service);
		}
	}

	@Override
	public void remove(IService service) {
		// TODO Auto-generated method stub
		if(serviceList.contains(service)) {
			serviceList.remove(service);
		}
	}

	@Override
	public void notifyService(ICustomer customer,double amount) {
		// TODO Auto-generated method stub
		for(IService service : serviceList) {
			service.update(customer,amount,this.getClass().getSimpleName());
		}
	}

}
