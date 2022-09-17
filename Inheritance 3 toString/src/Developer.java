
public class Developer extends Employee{
	
	private int noOfhrs;

	public Developer(int empId, String empName, double empSal, int noOfhrs) {
		super(empId, empName, empSal);
		this.noOfhrs = noOfhrs;
	}

	public int getNoOfhrs() {
		return noOfhrs;
	}

	public void setNoOfhrs(int noOfhrs) {
		this.noOfhrs = noOfhrs;
	}

	@Override
	public String toString() {
		
		return getEmpId()+"\t"+getEmpName()+"\t"+getEmpSal()+"\t\t"+noOfhrs;
		
		//return super.toString();
		
		/*return "Developer [noOfhrs=" + noOfhrs + ", getNoOfhrs()=" + getNoOfhrs() + ", getEmpId()=" + getEmpId()
				+ ", getEmpName()=" + getEmpName() + ", getEmpSal()=" + getEmpSal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
				*/
	}
	
}
