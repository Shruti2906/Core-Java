
public class Customer {
	
	private int custId;
	private String custName;
	private Address custAddress;
	private Product custProd;
	
	public Customer() {
	
	}

	public Customer(int custId, String custName, Address custAddress, Product custProd) {
	
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.custProd = custProd;
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

	public Address getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(Address custAddress) {
		this.custAddress = custAddress;
	}

	public Product getCustProd() {
		return custProd;
	}

	public void setCustProd(Product custProd) {
		this.custProd = custProd;
	}
	
	
}
