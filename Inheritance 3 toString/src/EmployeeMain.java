
public class EmployeeMain {

	public static void main(String[] args) {
	
		Manager mobj = new Manager(1, "abc", 20000, 10000);
		System.out.println("------------------------------- Manager ------------------------------");
		display(mobj, "Manager");
		
		Developer dobj = new Developer(2, "xyz", 30000, 7);
		System.out.println("------------------------------ Developer ------------------------------");
		display(dobj, "Developer");
		
	}

	public static void display(Employee eobj, String msg) {
		
		System.out.println(eobj);
		
	/*	System.out.println(msg+" Id\t\t:\t\t"+eobj.getEmpId());
		System.out.println(msg+" Name\t\t:\t\t"+eobj.getEmpName());
		//System.out.println(msg+" Salary\t\t:\t\t"+eobj.getEmpSal());
		System.out.println(msg+" Salary\t\t:\t\t"+eobj.getEmpSal());
		
		if(eobj instanceof Manager) {
			Manager mobj = (Manager)eobj;
			System.out.println(msg+" Bonus\t\t:\t\t"+mobj.getBonus());
			
		}
		if(eobj instanceof Developer) {
			Developer dobj = (Developer)eobj;
			System.out.println(msg+" no of Hours\t\t:\t\t"+dobj.getNoOfhrs());
			
		}
		*/
	}
}
