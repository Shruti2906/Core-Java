import java.util.Date;

public class Employee {

	private int empId;
	private String empName;
	private double empSal;
	private Date dob;
	
	public Employee(int empId, String empName, double empSal, Date dob) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.dob = dob;
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

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}
