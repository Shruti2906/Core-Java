
public class ShopMain {

	public static void main(String[] args) {
	
			ShopingInfo sInfo = new ShopingInfo();
			Customer cust = sInfo.createCustomer();
			Bill bill = sInfo.calculateBill(cust);
			sInfo.display(cust, bill);
			
	}

}
