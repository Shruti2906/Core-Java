package LinkCode.dao;

import java.util.List;

import LinkCode.DataSource.DBConnection;
import LinkCode.Entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public int createRecord(List<Employee> lst) {
		int i=0;
		
		DBConnection con = DBConnection.getConnection();
		return 0;
	}

}
