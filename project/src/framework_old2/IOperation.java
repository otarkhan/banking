package framework_old2;
import java.util.List;

public interface IOperation {
	
	void excecute();
	void excecute(Predicate predicate);
	String showExcecutionHistory();
	List<IRecord> getRecordList();

}
