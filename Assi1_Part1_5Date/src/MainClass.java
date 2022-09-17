
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		EmployeeInfo empinfo = new EmployeeInfo();
		
		Date date1 = new Date();
		Date date2 = new Date(2,11,2003);
		
	//	Employee e = new Employee(101, "John", date);
		Employee e1 = new Employee();
		e1.setEmpNo(101);
		e1.setEmpName("john");
		e1.setDate(date2);
		
		empinfo.display(e1);
		
		//Update date .....
		
		Date date3 = e1.getDate();
		date3.updateDate();
		
		empinfo.display(e1);
		
		
	//Object 2 user input..
		
		System.out.println("=================Empployee object 2============1");

		Employee e2 = new Employee();
		System.out.println("Enter employee No : ");
		e2.setEmpNo(sc.nextInt());
		System.out.println("Enter Employee Name : ");
		e2.setEmpName(sc.next());
		System.out.println("Enter joining date(dd/mm/yyyy) : ");
		Date dt = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());		
		e2.setDate(dt);
		empinfo.display(e2);
		
		
	}

}
