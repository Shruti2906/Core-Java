import java.util.Scanner;
import java.util.Date;

public class ShopingInfo {

	Scanner sc = new Scanner(System.in);
	
	public Customer createCustomer() {
		
		String ch;
		System.out.println("------------------- Enter Customer Information -------------------");
		System.out.println("Customer Id : ");
		int custId = sc.nextInt();
		System.out.println("Customer Name : ");
		String custName = sc.next();
		System.out.println("Customer Salary : ");
		double sal = sc.nextDouble();
		
		System.out.println("\nEnter Customer Address Details .....");
		System.out.println("Enter City : ");
		String city = sc.next();
		System.out.println("Enter State : ");
		String st = sc.next();
		System.out.println("Enter Pincode");
		int pincode = sc.nextInt();
		
		Address addr = new Address(city, st, pincode);
		
		System.out.println("How many products do you want : ");
		int n = sc.nextInt();
		Product pArr[] = new Product[n];
		int cnt = 0;
		
		System.out.println("\nEnter Customer's Product Purchase .....\n");
		do {
			System.out.println("Enter Product Id : ");
			int prodId = sc.nextInt();
			System.out.println("Enter Product Name : ");
			String prodName = sc.next() ;
			System.out.println("Enter Product Price : ");
			double price = sc.nextDouble();
			System.out.println("Enter Product Quantity : ");
			int qty = sc.nextInt();
			//Product prod = new Product(prodId, prodName, price, qty);
			pArr[cnt++] = new Product(prodId, prodName, price, qty);
			
			System.out.println("Continue Purchase(Y/N) : ");
			ch = sc.next();
		}while(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("yes"));
		
		Customer cust = new Customer(custId, custName, sal, addr, pArr);
		
		return cust;
	}
	
	public Bill calculateBill(Customer cust) {
		
		double total = 0.0;
		double cgst = 0.0;
		double sgst = 0.0;
		double finalTotal = 0.0;
		
		for(int i=0; i<cust.getProd().length; i++) {
			
			total = total+cust.getProd()[i].getProdPrice()*cust.getProd()[i].getProdQty();
		}
		cgst = total*0.06;
		sgst = total*0.06;
		finalTotal = total+cgst+sgst;
		Bill bill = new Bill(1, new Date(), total, cgst, sgst, finalTotal);
		return bill;
	}
	
	public void display(Customer cust, Bill bill) {
		
		System.out.println("------------------------------- Customer Information ----------------------\n");
		System.out.println("\tCustomer Id\t\t:\t\t"+cust.getCustId());
		System.out.println("\tCustomer Name\t\t:\t\t"+cust.getCustName());
		System.out.println("\tCustomer Salary\t\t:\t\t"+cust.getCustSal());
		
		System.out.println("\n\tCustomer Address : ");
		System.out.println("\tCity\t\t\t:\t\t"+cust.getAddr().getCity());
		System.out.println("\tState\t\t\t:\t\t"+cust.getAddr().getState());
		System.out.println("\tPincode\t\t\t:\t\t"+cust.getAddr().getPincode());
		
		System.out.println("\n\tCustomer's Product Purchase : ");
		System.out.println("\n\tProduct Id\tProduct Name\tProduct Price\tProduct Quantity");
		for(int i=0; i<cust.getProd().length; i++) {
			System.out.println("\t\t"+cust.getProd()[i].getProdId()+"\t\t"+cust.getProd()[i].getProdName()+"\t\t"+cust.getProd()[i].getProdPrice()+"\t\t"+cust.getProd()[i].getProdQty());
		}
		
		System.out.println("\n\tCustomer's Bill : ");
		System.out.println("\tBill Number\t\t:\t\t"+bill.getBillNo());
		System.out.println("\tDate\t\t\t:\t\t"+bill.getDate());
		System.out.println("\tTotal\t\t\t:\t\t"+bill.getTotal());
		System.out.println("\tCgst\t\t\t:\t\t"+bill.getCgst());
		System.out.println("\tSgst\t\t\t:\t\t"+bill.getSgst());
		System.out.println("\tFinal Total\t\t:\t\t"+bill.getFinalTotal());
			
	}

}
