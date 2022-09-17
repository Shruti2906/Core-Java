
public class MainClass {

	public static void main(String[] args) {

		CustomerInfo custinfo = new CustomerInfo();
		Customer cust = custinfo.create();
		custinfo.calculateBill(cust);
		custinfo.display(cust);
		
		System.out.println("\n\n+++++++++++ Thank You !! ++++++++++++");

	}

}
