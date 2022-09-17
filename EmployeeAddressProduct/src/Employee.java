
public class Employee {

	private int empId;
	private String empName;
	private int empSal;
	private Address addr;
	private Product pdr[];
	
	public Employee() {
	}

	public Employee(int empId, String empName, int empSal, Address addr, Product[] pdr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.addr = addr;
		this.pdr = pdr;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Product[] getPdr() {
		return pdr;
	}

	public void setPdr(Product pdr[]) {
		this.pdr = pdr;
	}
	
}
