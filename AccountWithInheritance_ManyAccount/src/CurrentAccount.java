
public class CurrentAccount extends Account{
	
	private String companyName;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(int accNo, String accType, double accBal, String companyName) {
		super(accNo, accType, accBal);
		this.companyName = companyName;
	}

	public String getCompnyName() {
		return companyName;
	}

	public void setCompnyName(String compnyName) {
		this.companyName = compnyName;
	}
	

}
