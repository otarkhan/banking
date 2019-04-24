package framework_old;
import java.util.ArrayList;
import java.util.List;

public abstract class AFinancialApplication implements IFinancialApplication {


	private List<IAccount> accountList = new ArrayList<IAccount>();

	public void addAccount(IAccount account) {
		if(account != null) 
			accountList.add(account);
	}
	
	
	
	public void excecuteOperation() {
		
	}



	public List<IAccount> getAccountList() {
		return accountList;
	}

}
