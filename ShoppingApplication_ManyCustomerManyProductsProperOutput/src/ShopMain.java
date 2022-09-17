import java.util.Scanner;
public class ShopMain {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			ShopingInfo sInfo = new ShopingInfo();
		//	Customer cust[] = sInfo.createCustomer(); //to create multiple customers
			Customer custArr[] = sInfo.createCustArr();
		//	Bill bill[] = sInfo.calculateBill(custArr);
			//sInfo.display(custArr, bill);
			
			int custId;
			
			Bill bill;
			int ch;
			String str;
			do {
					System.out.println("1 : Add Customer \n2 : Display Customer Details \n3 : Add Product\n4 : View Bill");
					ch = sc.nextInt();
					switch(ch) {
					case 1:
							sInfo.addCustomer(custArr);
							System.out.println("\n-------------------------------------------------------");
							System.out.println("Customer Added Successfully.!");
							System.out.println("\n-------------------------------------------------------\n");
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
							custId = sc.nextInt();
							Customer cust = sInfo.searchCust(custArr, custId);
							bill = sInfo.calculateBill(custArr, custId);
							if(bill != null) {
								sInfo.displayBill(cust, bill);
							}
							else {
								System.out.println("\nCustomer does NOT Exist.!");
							}
						break;
						
					default : System.out.println("Invalid choice..!");
					}
					System.out.println("Do you want to continue (Y/N) : ");
					str = sc.next();
			}while(str.equalsIgnoreCase("y") || str.equalsIgnoreCase("yes"));
			
			System.out.println("\nThank You ..! Visit Again..!!");
			
	}

}
