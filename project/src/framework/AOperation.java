package framework;
import java.util.ArrayList;
import java.util.List;

public abstract class AOperation implements IOperation {
	
	private List<IAccount> accountList;
	private List<IRecord> recordList = new ArrayList<IRecord>();
	

	public AOperation(List<IAccount> accountList) {
		super();
		this.accountList = accountList;
	}

	public List<IAccount> getAccountList() {
		return accountList;
	}
	
	public void addRecord(IRecord record) {
		if(record != null) {
			recordList.add(record);

		}
	}

	public List<IRecord> getRecordList() {
		return recordList;
	}


}
