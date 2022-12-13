import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeJDBC {

	
	public Connection getDConnection() {
		
		Connection con = null;
		
		try {
			//load Driver
			Class.forName("oracle.jdbc.OracleDriver");
			
			//established connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1612");
			
			System.out.println("Connection to Database done.!");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void insertData(Connection con, Employee e) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			PreparedStatement pstate = con.prepareStatement("insert into Employee values(?, ?, ?)");
			
			pstate.setInt(1, e.getEmpId());
			pstate.setString(2, e.getEmpName());
			pstate.setDouble(3, e.getEmpSalary());
			int i = pstate.executeUpdate();
			if(i>0) {
				System.out.println("Record inserted.!");
			}
			else {
				System.out.println("Unable to insert Record.!");
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	public void updateData(Connection con) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee id to update the record : ");
		int eid = sc.nextInt();
		System.out.println("1] id\t2] name\t 3] salary : ");
		int op = sc.nextInt();
		
		if(op == 1) {
			PreparedStatement pstate;
			try {
				pstate = con.prepareStatement("update employee set id = ? where id = ?");
				pstate.setInt(2, eid);
				System.out.println("Enter new emp id to update : ");
				pstate.setInt(1, sc.nextInt());
				int i = pstate.executeUpdate();
				if(i>0) {
					System.out.println("Record Updatd.!");
				}
				else {
					System.out.println("Unable to update Record.!");
				}
				
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			
			
		}
		else if(op == 2) {
			PreparedStatement pstate;
			try {
				pstate = con.prepareStatement("update employee set name = ? where id = ?");
				pstate.setInt(2, eid);
				System.out.println("Enter new emp name to update : ");
				pstate.setString(1, sc.next());
				int i = pstate.executeUpdate();
				if(i>0) {
					System.out.println("Record updated.!");
				}
				else {
					System.out.println("Unable to update Record.!");
				}
				
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
		}
		else if(op == 3) {
			PreparedStatement pstate;
			try {
				pstate = con.prepareStatement("update employee set salary = ? where id = ?");
				pstate.setInt(2, eid);
				System.out.println("Enter new emp salary to update : ");
				pstate.setFloat(1, sc.nextFloat());
				int i = pstate.executeUpdate();
				if(i>0) {
					System.out.println("Record updated.!");
				}
				else {
					System.out.println("Unable to update Record.!");
				}
				
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
		}
		else {
			System.out.println("Invalid Option..!");
		}

	}
	
	public void deleteData(Connection con) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id to delete record : ");
		int sid = sc.nextInt();
		
		try {
			PreparedStatement pstate = con.prepareStatement("DELETE from Employee WHERE id = ?");
			pstate.setInt(1, sid);
			int i = pstate.executeUpdate();
			if(i>0) {
				System.out.println("Record Deleted.!");
			}
			else {
				System.out.println("Unable to Delete Record.!");
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	public void displayData(Connection con) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter Employee id to dispaly record : ");
			int sid = sc.nextInt();
			PreparedStatement pstate = con.prepareStatement("select * from Employee where id = ?");
			pstate.setInt(1, sid);
			ResultSet result = pstate.executeQuery();
			System.out.println("ID\tName\tSalary");
			
			if(result.next()) {
				System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getFloat(3));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
}
/*
  create table Employee
  (
  	id number(5),
  	name varchar2(20),
  	salary float
  );  
  
*/
