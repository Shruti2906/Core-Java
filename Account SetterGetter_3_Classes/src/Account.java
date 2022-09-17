
public class Account {
	
	private int accId;
	private String accHolderName;
	private double accBal;
	
	
	public Account() {
		
	}

	public Account(int accId, String accHolderName, double accBal) {
		super();
		this.accId = accId;
		this.accHolderName = accHolderName;
		this.accBal = accBal;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	
	

}
