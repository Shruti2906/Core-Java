
import java.util.Scanner;
import java.sql.Connection;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EmployeeJDBC empJdbc = new EmployeeJDBC();
		Connection con = empJdbc.getDConnection();
		
		Employee emp = new Employee();
		
		System.out.println("1 : Insert\n2 : Update\n3 : Delete\n4 : Display");
		System.out.println("Enter your choice : ");
		int ch = sc.nextInt();
		if(ch == 1) {
			System.out.println("Enter Employee id, name, salary : ");
			emp.setEmpId(sc.nextInt());
			emp.setEmpName(sc.next());
			emp.setEmpSalary(sc.nextDouble());
			empJdbc.insertData(con, emp);
			
		}
		else if(ch == 2) {
			
			empJdbc.updateData(con);
		}
		else if(ch == 3) {
			empJdbc.deleteData(con);
		}
		else if(ch == 4) {
			
			empJdbc.displayData(con);
		}
		else {
			System.out.println("Invalid Chice..!");
		}
	}

}
