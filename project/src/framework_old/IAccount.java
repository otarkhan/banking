package framework_old;
import java.util.List;

public interface IAccount {
	
	void excecuteOperation(IOperation operation);
	void addOperation(IOperation operation);
	boolean updateBalance(double amount);
	double getBalance();
	String getAccountID();
}
