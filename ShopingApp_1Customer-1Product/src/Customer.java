
public class Customer {
	
	private int custId;
	private String custName;
	private double custSal;
	private Address addr;
	private Product prod;

	public Customer() {
	}

	public Customer(int custId, String custName, double custSal, Address addr, Product prod) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custSal = custSal;
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

	public double getCustSal() {
		return custSal;
	}

	public void setCustSal(double custSal) {
		this.custSal = custSal;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}
	
}
