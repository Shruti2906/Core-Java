import java.util.Scanner;
public class ShopMain {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			ShopingInfo sInfo = new ShopingInfo();
			Customer cust[] = sInfo.createCustomer();
			Bill bill[] = sInfo.calculateBill(cust);
			sInfo.display(cust, bill);
	}

}
