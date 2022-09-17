
public class EmployeeInfo {

	public Employee create() {
		
		Address addr = new Address("Pune", "MH", 413501);
		ProductInfo pInfo = new ProductInfo();
		Product pArr[] = pInfo.createProduct();
		pInfo.calculateProductBill(pArr);
		
		Employee emp = new Employee(101,"John",50000, addr, pArr);
		return emp;	
	}
	
	public void display(Employee emp) {
		
		System.out.println("\t-------------------------------------------------------------------");
		System.out.println("\tEmployee Id : "+emp.getEmpId());
		System.out.println("\tEmployee Name : "+emp.getEmpName());
		System.out.println("\tEmployee salary : "+emp.getEmpSal());
		System.out.println("\tEmployee Address : ");
		System.out.println("\tCity : "+emp.getAddr().getCity());
		System.out.println("\tState : "+emp.getAddr().getState());
		System.out.println("\tPincode : "+emp.getAddr().getPincode());
		System.out.println("\tEmployee's Product Purchase : ");
		ProductInfo pInfo = new ProductInfo();
		pInfo.displayProduct(emp.getPdr());
		//System.out.println(""+);
	}
	
}
//hana
//add bill class, Orm
//many cust
