package Linkcode.UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Linkcode.Entity.Employee;
import Linkcode.JDBC_DAO.EmployeeDAO;

public class EmployeeMainUI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		EmployeeDAO empdao = new EmployeeDAO();
		
		List<Employee> lst = new ArrayList<Employee>();
		
		String str;
		do {
			System.out.println("1 : Save\n2 : Update\n3 : Delete\n4 : Display");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			
			switch(ch) {
			
				case 1:
					System.out.println("Enter student id, name, salary : ");
					Employee empobj = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
					lst.add(empobj);
					int i = empdao.saveEmp(lst);
					if(i>0) {
						System.out.println("Record Saved..");
					}
					else {
						System.out.println("Unable to save the record..");
					}
					break;
				
				case 2:
					int i1 = empdao.updateEmp();
							if(i1>0) {
								System.out.println("Record Updated..!!");
							}
							else {
								System.out.println("Failed to Update Record..!");
							}
						break;
						
				case 3:
					System.out.println("Enter student id to delete the record : ");
					int eid = sc.nextInt();
					int i3 = empdao.deleteEmp(eid);
					if(i3>0) {
						System.out.println("Record Dleted!");
					}
					else {
						System.out.println("Unable to delete record!");
					}
					break;
					
				case 4:
					System.out.println("Enter student id to display the record : ");
					int eid1 = sc.nextInt();
					List <Employee> lst1 = empdao.displayEmp(eid1);
					if(lst1 != null) {
						Employee emp = (Employee) lst1.get(0);
						System.out.println(emp.getEmpId()+"\t"+emp.getEmpName()+"\t"+emp.getEmpSalary());
					}
					
					break;
					
				default: System.out.println("Invalid Choice..");
			}
			System.out.println("Do you Want to Continue(Y/N) : ");
			str = sc.next();
		}while(str.equalsIgnoreCase("y"));

		System.out.println("Thank You ..!!");
	}

}
