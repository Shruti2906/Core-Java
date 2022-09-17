
public class Product {
	
	private int prodId;
	private String prodName;
	private double prodPrice;
	private int prodQty;
	private double cgst;
	private double sgst;
	private double total;
	private double finalTotal;
	
	
	public Product() {
	
	}
	public Product(int prodId, String prodName, double prodPrice, int prodQty) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodQty = prodQty;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public int getProdQty() {
		return prodQty;
	}
	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
	public double getCgst() {
		return cgst;
	}
	public void setCgst(double cgst2) {
		this.cgst = cgst2;
	}
	public double getSgst() {
		return sgst;
	}
	public void setSgst(double sgst2) {
		this.sgst = sgst2;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total2) {
		this.total = total2;
	}
	public double getFinalTotal() {
		return finalTotal;
	}
	public void setFinalTotal(double finalTotal2) {
		this.finalTotal = finalTotal2;
	}
	
	

}
