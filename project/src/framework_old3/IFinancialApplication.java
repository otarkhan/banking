package framework_old3;
import java.util.ArrayList;
import java.util.List;

public interface IFinancialApplication {
	
	

	void addAccount(IAccount account);
	List<IAccount> getAccountList();
	
}
