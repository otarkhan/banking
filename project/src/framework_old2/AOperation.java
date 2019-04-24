package framework_old2;
import java.util.List;

public abstract class AOperation implements IOperation {
	
	public List<IAccount> getAccountList() {
		return accountList;
	}



	private List<IAccount> accountList;
	private List<IRecord> recordList;
	

	public AOperation(List<IAccount> accountList) {
		super();
		this.accountList = accountList;
	}


	public List<IRecord> getRecordList() {
		return recordList;
	}


}
