package Linkcode.JDBC_DAO;

import java.util.List;

import Linkcode.Entity.Employee;

public interface EmployeeImpDao {

	public int saveEmp(List<Employee> lst);
	public int updateEmp();
	public int deleteEmp(int eid);
	public List<Employee> displayEmp(int eid);
	
	//int saveEmp(List<Linkcode.JDBC_DAO.Employee> lst);
	
}
