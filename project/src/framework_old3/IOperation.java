package framework_old3;
import java.util.List;

public interface IOperation {
	
	void excecute();
	void excecute(Predicate predicate);
	String showExcecutionHistory();
	List<IRecord> getRecordList();
	void addRecord(IRecord record);

}
