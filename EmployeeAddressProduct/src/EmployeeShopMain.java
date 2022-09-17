
public class EmployeeShopMain {

	public static void main(String[] args) {
	
		EmployeeInfo empInfo = new EmployeeInfo();
		Employee emp = empInfo.create();
		empInfo.display(emp);
	} 
}
