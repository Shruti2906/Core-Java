import java.util.List;

public interface EmpServices {

	List<Employee> create();
	//display
	void display(List<Employee> lst);
	//search
	int search(List<Employee> lst, int empId);
	//delete
	List<Employee> delete(List<Employee> lst, int empId);
	//update
	boolean update(List<Employee> lst, int empId);
	
}
