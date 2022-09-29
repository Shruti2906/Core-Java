import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShopMain {

	public static void main(String[] args) throws ParseException {
	
		Scanner sc = new Scanner(System.in);
		
		ShopInfo sInfo = new ShopInfo();
		Customer custArr[] = sInfo.createCustomer();
		
		Bill bill;
		String str;
		int ch;
		do {
			
			System.out.println("\n\n************************************** LinkCode Shopping Bazar *****************************************");
			System.out.println("\n\n\t\t\t1 : Add Customer\n\t\t\t2 : Display Customer Details\n\t\t\t3 : Add Product\n\t\t\t4 : View Bill");
			System.out.println("\t\t\tEnter Your choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
				case 1:
					sInfo.addCustomer(custArr);
					break;
					
				case 2:
					sInfo.display(custArr);
					break;
					
				case 3:
					if(sInfo.addProduct(custArr)) {
						System.out.println("\n-------------------------------------------------------");
						System.out.println("Product added successfully.!");
						System.out.println("\n-------------------------------------------------------\n");
					}
					else {
						System.out.println("\n-------------------------------------------------------");
						System.out.println("Cannot Proceed Futhur.!");
						System.out.println("\n-------------------------------------------------------");
					}
					break;
					
				case 4:
					System.out.println("Enter Customer Id to get Bill : ");
					int custId = sc.nextInt();
					Customer cust = sInfo.searchAccount(custArr, custId);
					bill = sInfo.calculateBill(custArr, custId);
					if(cust!= null && bill != null) {
						sInfo.displayBill(cust, bill);
					}
					else {
						System.out.println("\n-------------------------------------------------------");
						System.out.println("Customer does NOT Exist Or May NOT Have Bill.!");
						System.out.println("\n-------------------------------------------------------");
					}
					
					break;
					
				default: System.out.println("Invalid choice..");
			}
			System.out.println("Do you want to continue(Y/N) : ");
			str = sc.next();
		}while((str.equalsIgnoreCase("y")) || (str.equalsIgnoreCase("yes")));
		
		System.out.println("\n-------------------------------------------------------");
		System.out.println("Thank You .!");	
		System.out.println("\n-------------------------------------------------------");
	}
	
	
}
