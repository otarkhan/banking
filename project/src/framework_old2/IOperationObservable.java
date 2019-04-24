package framework_old2;

public interface IOperationObservable {

	void attach(IService service);
	void remove(IService service);
	void notifyService(ICustomer customer,double amount);
	
}
