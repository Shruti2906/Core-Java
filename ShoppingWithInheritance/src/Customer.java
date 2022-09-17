import java.util.Date;

public class Customer {

	private int custId;
	private String custName;
	private Date dob;
	private Address addr;
	private Product prod[];
	private int purhcaseCnt = 0;
	
	public Customer() {
		super();
	}

	public Customer(int custId, String custName, Date dob, Address addr, Product prod[]) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.dob = dob;
		this.addr = addr;
		this.prod = prod;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Product[] getProd() {
		return prod;
	}

	public void setProd(Product prod[]) {
		this.prod = prod;
	}

	public int getPurhcaseCnt() {
		return purhcaseCnt;
	}

	public void setPurhcaseCnt(int purhcaseCnt) {
		this.purhcaseCnt = purhcaseCnt;
	}
	
	
}
