
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class MainDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Employee> lst = new LinkedList();
		String str;
		do {
			
			System.out.println("Enter Employee Id, Name, Salary : ");
			Employee e = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
			lst.add(e);
			System.out.println("Do you want to add more Employee(Y/N) : ");
			str = sc.next();
			
		}while(str.equalsIgnoreCase("y") || (str.equalsIgnoreCase("yes")));
		
		display(lst);
		
		System.out.println("Thank You...!!");

	}
	
	public static void display(List<Employee> lst) {
	
		for(Employee e:lst) {
			System.out.println(e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSalary());
			
		}
	}

}
