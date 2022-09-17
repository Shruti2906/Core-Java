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
			
			System.out.println("1 : Add Customer\n2 : Display Customer Details\n3 : Add Product\n4 : View Bill");
			System.out.println("Enter Your choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
				case 1:
					sInfo.addCustomer(custArr);
					break;
					
				case 2:
					sInfo.display(custArr);
					break;
					
				case 3:
					sInfo.addProduct(custArr);
					System.out.println("\n-------------------------------------------------------");
					System.out.println("Product added successfully.!");
					System.out.println("\n-------------------------------------------------------\n");
					break;
					
				case 4:
					System.out.println("Enter Customer Id to get Bill : ");
					int custId = sc.nextInt();
					Customer cust = sInfo.searchAccount(custArr, custId);
					bill = sInfo.calculateBill(custArr, custId);
					if(bill != null) {
						sInfo.displayBill(cust, bill);
					}
					else {
						System.out.println("\nCustomer does NOT Exist.!");
					}
					
					break;
					
				default: System.out.println("Invalid choice..");
			}
			System.out.println("Do you want to continue(Y/N) : ");
			str = sc.next();
		}while((str.equalsIgnoreCase("y")) || (str.equalsIgnoreCase("yes")));
		
		System.out.println("Thank You .!");	
	}
	
	
}
