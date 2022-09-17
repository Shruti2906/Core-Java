
public class Manager extends Employee{
	
	private double bonus;

	public Manager() {
		super();
	}

	public Manager(int empId, String empName, double empSal, double bonus) {
		super(empId, empName, empSal);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		
		return getEmpId()+"\t"+getEmpName()+"\t"+getEmpSal()+"\t\t"+bonus;
	}
	

}
