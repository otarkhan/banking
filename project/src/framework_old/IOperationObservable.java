package framework_old;

public interface IOperationObservable {

	void attach(IService service);
	void remove(IService service);
	void notifyService();
	
}
