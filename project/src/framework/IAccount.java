package framework;
import java.util.List;

public interface IAccount {
	
	void excecuteOperation(IOperation operation);
	void addOperation(IOperation operation);
	boolean updateBalance(double amount);
	ICustomer getCustomer();
	double getBalance();
	String getAccountID();
}
