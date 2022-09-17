
public class Customer {
	
	private int custId;
	private String custName;
	private String custMobNo;
	private Account acc[];
	private int accCount;
	
	{
		accCount = 0;
	}
	
	public Customer() {
		super();
	}

	public Customer(int custId, String custName, String custMobNo, Account acc[]) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custMobNo = custMobNo;
		this.acc = acc;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustMobNo() {
		return custMobNo;
	}

	public void setCustMobNo(String custMobNo) {
		this.custMobNo = custMobNo;
	}

	public Account[] getAcc() {
		return acc;
	}

	public void setAcc(Account acc[]) {
		this.acc = acc;
	}

	public int getAccCount() {
		return accCount;
	}

	public void setAccCount(int accCount) {
		this.accCount = accCount;
	}
	

}
