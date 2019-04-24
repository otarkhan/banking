package framework_old3;
import java.util.List;

public class Account extends AAccount {

	public Account(ICustomer customer, String accountID)  {
		super(customer, accountID);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void excecuteOperation(IOperation operation) {
		// TODO Auto-generated method stub
		operation.excecute();
	}

	



}
