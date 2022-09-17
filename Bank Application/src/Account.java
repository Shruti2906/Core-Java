import java.util.Date;

public class Account {
	
	private int accNo;
	private String CustName;
	private Date AccCreationDt;
	private double accBal;
	private String password;
	
	public Account() {
	}

	public Account(int accNo, String custName, Date AccCreationDt, double accBal, String password) {
		super();
		this.accNo = accNo;
		CustName = custName;
		this.AccCreationDt = AccCreationDt;
		this.accBal = accBal;
		this.password = password;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getCustName() {
		return CustName;
	}

	public void setCustName(String custName) {
		CustName = custName;
	}

	public Date getAccCreationDt() {
		return AccCreationDt;
	}

	public void setAccCreationDt(Date accCreationDt) {
		AccCreationDt = accCreationDt;
	}

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
