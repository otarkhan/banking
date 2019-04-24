package framework_old3;
import java.time.LocalDate;

public class Record extends ARecord{
	
	private LocalDate currentDate;
	private double oldBalance;
	private double amount;
	private double newBalance;
	private String operation;
	
	

	public Record(String operation, double oldBalance, double amount, double newBalance) {
		super();
		this.currentDate = LocalDate.now();
		this.operation = operation;
		this.oldBalance = oldBalance;
		this.amount = amount;
		this.newBalance = newBalance;
	}



	@Override
	public IRecord generateRecord() {
		// TODO Auto-generated method stub
		return this;
	}



	@Override
	public String toString() {
		return 
				"Old balance : " + oldBalance +" \n"+
				operation+" : " + amount +" \n"+
				"New balance : " + newBalance +" \n";
	}

}
