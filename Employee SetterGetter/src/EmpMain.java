
import java.util.Scanner;
public class EmpMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Emp e = new Emp();
		
		System.out.println("Enter Employee Id : ");
		e.setEmpId(sc.nextInt());
		
		System.out.println("Enter Employee Name : ");
		e.setEmpName(sc.next());
		
		System.out.println("Enter Employee Salary : ");
		e.setEmpSal(sc.nextDouble());
		
		System.out.println("==================== Display ==================");
		
		System.out.println("Employee Id : "+e.getEmpId());
		System.out.println("Employee Name : "+e.getEmpName());
		System.out.println("Employee Salary : "+e.getEmpSal());

	}

}
