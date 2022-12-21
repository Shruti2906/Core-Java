import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmpServicesImpl implements EmpServices{

	Scanner sc = new Scanner(System.in);
	
	@Override
	public List<Employee> create() {
		List <Employee> lst = new LinkedList();
		
		String str;
		do {
			System.out.println("Enter Employee Id, Name, Salary : ");
			Employee emp = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
			lst.add(emp);
			System.out.println("Want More employee(y/n) : ");
			str = sc.next();
		}while(str.equalsIgnoreCase("y") || str.equalsIgnoreCase("yes"));
		
		return lst;
	}
	
	@Override
	public void display(List<Employee> lst) {
	
		for(Employee e:lst) {
			System.out.println("\t"+e.getEmpId()+"\t"+e.getEmpName()+"\t"+e.getEmpSalary());
		}
	}

	@Override
	public int search(List<Employee> lst, int empId) {

		int cnt = 0;
		for(Employee e:lst) {
			if(e.getEmpId() == empId) {
				return cnt;
			}
			cnt++;
		}
		return -1;
	}

	@Override
	public List<Employee> delete(List<Employee> lst, int empId) {
		
		List<Employee> elst = null;
		
		int index = search(lst, empId);
		if(index != -1) {
			elst = new LinkedList();
			for(int i=0; i<index; i++) {
				elst.add(lst.get(i));
			}
			
			for(int i=index+1; i<lst.size(); i++) {
				elst.add(lst.get(i));
			}
		}
		return elst;
	}

	@Override
	public boolean update(List<Employee> lst, int empId) {
		
		int index = search(lst, empId);
		
		if(index != -1) {
			System.out.println("What You want to update : ");
			System.out.println("1 : Id\n2 : Name\n3 : Salary");
			System.out.println("SELECT : ");
			int ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("Enter New EmpId : ");
				int newId = sc.nextInt();
				Employee e = lst.get(index);
				e.setEmpId(newId);
				return true;
			}
			else if(ch == 2) {
				System.out.println("Enter New Emp Name  : ");
				String newNm = sc.next();
				Employee e = lst.get(index);
				e.setEmpName(newNm);
				return true;
			}
			else if(ch == 3) {
				System.out.println("Enter New Emp Salary : ");
				double newSal = sc.nextDouble();
				Employee e = lst.get(index);
				e.setEmpSalary(empId);
				return true;
			}
		}
		return false;
	}
	
}
