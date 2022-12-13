package Linkcode.JDBC_DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Linkcode.DataSource.DBConnection;
import Linkcode.Entity.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO implements EmployeeImpDao{

	static Connection con = null;
	static {
		DBConnection db = new DBConnection();
		con = db.getConnection();
	}
	
	@Override
	public int saveEmp(List<Employee> lst) {
		Scanner sc = new Scanner(System.in); 
				
		PreparedStatement pstate;
		
		int i = 0;
		try {
			Employee empobj = lst.get(0);
			
			pstate = con.prepareStatement("insert into empjdbc3 values(?, ?, ?)");
			pstate.setInt(1, empobj.getEmpId());
			pstate.setString(2, empobj.getEmpName());
			pstate.setDouble(3, empobj.getEmpSalary());
			i = pstate.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int updateEmp() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id to update the record : ");
		int sid = sc.nextInt();
		System.out.println("what you want to update [1: id\t2: name\t3: salary] : ");
		int ch1 = sc.nextInt();
		int i = 0;
		try {
			
			if(ch1==1) {
				PreparedStatement pstate = con.prepareStatement("update empjdbc3 set id  = ? where id = ?");
				pstate.setInt(2, sid);
				System.out.println("Enter new Id : ");
				int updateId = sc.nextInt();
				pstate.setInt(1, updateId);
				i = pstate.executeUpdate();
			}
			else if(ch1==2) {
				PreparedStatement pstate = con.prepareStatement("update empjdbc3 set name  = ? where id = ?");
				pstate.setInt(2, sid);
				System.out.println("Enter new Name : ");
				String updatenm = sc.next();
				pstate.setString(1, updatenm);
				i = pstate.executeUpdate();
			}
			if(ch1==3) {
				PreparedStatement pstate = con.prepareStatement("update empjdbc3 set salary  = ? where id = ?");
				pstate.setInt(2, sid);
				System.out.println("Enter new salary : ");
				double updatesalary = sc.nextDouble();
				pstate.setDouble(1, updatesalary);
				i = pstate.executeUpdate();
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return i;
	}

	public int deleteEmp(int eid) {
		
		int i = 0;
		PreparedStatement pstate;
		try {
			pstate = con.prepareStatement("delete from empjdbc3 where id = ?");
			pstate.setInt(1, eid);
			i = pstate.executeUpdate();
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return i;
	}
	
	public List<Employee> displayEmp(int eid) {
	
		List<Employee> lst = new ArrayList();
		
		try {
			PreparedStatement pstate = con.prepareStatement("select * from empjdbc3 WHERE id = ?");
			pstate.setInt(1, eid);
			ResultSet result =  pstate.executeQuery();
			while(result.next()) {
				Employee empobj = new Employee(result.getInt(1), result.getString(2), result.getDouble(3));
				lst.add(empobj);
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return lst;
	}
	
	
}

/*
 
  create table empjdbc3
  (
  	id number(5),
  	name varchar2(20),
  	salary float
  );
 
 */
