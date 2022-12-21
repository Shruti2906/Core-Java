import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainDemo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String str;
		
		List<Employee> lst = new LinkedList();
		EmpServicesImpl empServeImp = new EmpServicesImpl();
		Employee emp = null;
		
		do {
			
			System.out.println("1 : Create\n2 : Display\n3 : Search\n4 : Delete\n5 : Update");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			switch(ch) {
			
			case 1:
				lst = empServeImp.create();
				if(lst!=null) {
					System.out.println("Employee/s added..!!");
				}
				else {
					System.out.println("failed to add employees..!!");
				}
				break;
				
			case 2:
				empServeImp.display(lst);
					
				break;
			
			case 3:
				System.out.println("Enter Emp id to search : ");
				int empId = sc.nextInt();
				if(empServeImp.search(lst, empId) != -1) {
					System.out.println("Employee Found..");
				}
				else {
					System.out.println("No Mach Found.!");
				}
				break;
				
			case 4:
				System.out.println("Enter Emp id to delete : ");
				int empId1 = sc.nextInt();
				List<Employee> elst = empServeImp.delete(lst, empId1); 
				if(elst != null) {
					lst.clear();
					for(Employee e:elst) {
						lst.add(e);
					}
					System.out.println("Record deleted.!");
				}
				else {
					System.out.println("Failed to delete");	
				}
				break;
			
			case 5:
				System.out.println("Enter Emp id to update : ");
				int empId2 = sc.nextInt();
				if(empServeImp.update(lst, empId2)) {
					System.out.println("Update Successfull..!!");
				}
				else {
					System.out.println("Unable to update record.!");
				}
					
					
				break;
			default:System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue?(y/n): ");
			str = sc.next();
			
		}while(str.equalsIgnoreCase("y") || str.equalsIgnoreCase("yes"));

		System.out.println("Thank You.!Visit Again..!");
	}

}
