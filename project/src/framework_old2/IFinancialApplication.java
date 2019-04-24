package framework_old2;
import java.util.ArrayList;
import java.util.List;

public interface IFinancialApplication {
	void addAccount(IAccount account);
	void createOperation(String accountNumber, double amount);
	void excecuteOperation();
	List<ICustomer> getCustomerInformation();
	List<IAccount> getAccountList();
}
