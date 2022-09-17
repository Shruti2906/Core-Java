
import java.util.Scanner;
public class EmployeeInfo {
	
	Scanner sc = new Scanner(System.in);
	
	public Employee[] create() {
		
		Employee emp[] = new Employee[5];
		
		for(int i=0; i<2; i++) {
			Employee e = new Employee();
			System.out.println("Enter Employee Number : ");
			e.setEmpNo(sc.nextInt());
			System.out.println("Enter Employee Name : ");
			e.setEnpName(sc.next());
			System.out.println("Enter Joining Date (dd mm yyyy) : ");
			Date date = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
			e.setDate(date);
			emp[i] = e;
		}
		return emp;
		
	}

	public void display(Employee[] emp) {
		
		for(int i=0 ;i<emp.length; i++) {
			System.out.println("------------------- Employee "+(i+1)+" --------------------");
			System.out.println("Employee Number : "+emp[i].getEmpNo());
			System.out.println("Employee Name : "+emp[i].getEnpName());
			System.out.println("Joining Date : "+emp[i].getDate().getDay()+"/"+emp[i].getDate().getMonth()+"/"+emp[i].getDate().getYear());
			
		}
		
	}
}
