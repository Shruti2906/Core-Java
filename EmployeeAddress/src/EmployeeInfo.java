
public class EmployeeInfo {

	public Employee create() {
	
		Address addr = new Address("Pune", "MH", 413501);
		Employee emp = new Employee(101, "John", 2000, addr);
		return emp;
		
	}
	public void display(Employee emp) {
		System.out.println("Employee Id : "+emp.getEmpId());
		System.out.println("Empoyee Name : "+emp.getEmpName());
		System.out.println("Empoyee Salary : "+emp.getEmpSal());
		System.out.println("Adress :");
		
		System.out.println("\t City : "+emp.getAddr().getCity());
		System.out.println("\t State : "+emp.getAddr().getState());
		System.out.println("\t Pincode : "+emp.getAddr().getPincode());
	
	}
}
//product,address, 3 class 