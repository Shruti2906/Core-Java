
public class Employee {

	private int empNo;
	private String empName;
	private Date date;
	
	public Employee() {
	
	}

	public Employee(int empNo, String empName, Date date) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.date = date;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEnpName() {
		return empName;
	}

	public void setEnpName(String enpName) {
		this.empName = enpName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
