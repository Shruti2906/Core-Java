
public class ShopMain {

	public static void main(String[] args) {
		
		ShopInfo sInfo = new ShopInfo();
		Customer cust = sInfo.createCustomer();
		Bill bill = sInfo.calculateBill(cust);
		sInfo.displayCustomer(cust, bill);
	}

}
