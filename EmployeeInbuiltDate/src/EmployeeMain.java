
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) throws Exception {
		
			Scanner sc = new Scanner(System.in);
			
			int n;
			System.out.println("How many Employees do you want : ");
			n = sc.nextInt();

			Employee earr[] = new Employee[n];
			
			for(int i=0; i<n; i++) {
				System.out.println("Enter Employee Id : ");
				int empId = sc.nextInt();
				
				System.out.println("Enter Employee Name : ");
				String empName = sc.next();
				
				System.out.println("Enter Employee Salary : ");
				double empSal = sc.nextDouble();
				
				System.out.println("Enter Employee dob : ");
				String sDate = sc.next();
				
				//convert String to date
				Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
				
				//Employee e = new Employee(empId, empName, empSal, date1);
				earr[i] = new Employee(empId, empName, empSal, date1);
				
			}
			
			for(int i=0; i<n; i++) {
				System.out.println("-------------------------------------------------------------");
				System.out.println("Employee Id : "+earr[i].getEmpId());
				System.out.println("Employee Id : "+earr[i].getEmpName());
				System.out.println("Employee Id : "+earr[i].getEmpSal());
				System.out.println("Employee Id : "+earr[i].getDob());
			}
	}

}
//assi Q 2 3 4 5 