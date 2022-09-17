import java.util.Date;
import java.util.Scanner;

public class ShopInfo {
	
	Scanner  sc = new Scanner(System.in);
	
	public Customer createCustomer() {
		
		//Address addr = new Address("Pune", "Mh", 410516);
		//Product prod = new Product(1, "Pen", 10, 2);
		//Customer cust = new Customer(101, "John" ,100000, addr, prod);
		
		System.out.println("**** Enter Customer Info ****");
		System.out.println("Enter Customer Id : ");
		int custId = sc.nextInt();
		System.out.println("Enter Customer Name : ");
		String custName = sc.next();
		System.out.println("Enter Cuatomer Salary : ");
		double sal = sc.nextDouble();
		
		System.out.println("\nEnter Address of Customer");
		System.out.println("Enter City : ");
		String city = sc.next();
		System.out.println("Enter State : ");
		String st = sc.next();
		System.out.println("Enter Pincode : ");
		int pincode = sc.nextInt();
		Address addr = new Address(city, st, pincode);
		
		System.out.println("\nEnter Customer's Product Purchase");
		System.out.println("Enter Product Id : ");
		int prodId = sc.nextInt();
		System.out.println("Enter Product Name : ");
		String prodName = sc.next();
		System.out.println("Enter Product Price : ");
		double price = sc.nextDouble();
		System.out.println("Enter Product Quantity : ");
		int qty = sc.nextInt();
		Product prod = new Product(prodId, prodName, price, qty);
		
		Customer cust = new Customer(custId, custName,sal, addr, prod);
		
		return cust;
	}
	
	public Bill calculateBill(Customer cust) {
		
		double total = 0.0;
		double cgst = 0.0;
		double sgst = 0.0;
		double finalTotal = 0.0;
		
		total = cust.getProd().getProdPrice()*cust.getProd().getProdQty();
		cgst = total*0.06;
		sgst = total*0.06;
		finalTotal = total+cgst+sgst;
		
		Bill bill = new Bill(1, new Date(), total, cgst, sgst, finalTotal);
		
		return bill;
		
	}
	
	public void displayCustomer(Customer cust, Bill bill) {
		
		System.out.println("\n---------------------------------- Customer Info --------------------------------------\n");
		System.out.println("\tCustomer Id\t\t:\t\t"+cust.getCustId());
		System.out.println("\tCustomer Name\t\t:\t\t"+cust.getCustName());
		System.out.println("\tCustomer Salary\t\t:\t\t"+cust.getCustSal());
		
		System.out.println("\n\tCustomer Address : ");
		System.out.println("\tCity\t\t\t:\t\t"+cust.getAddr().getCity());
		System.out.println("\tState\t\t\t:\t\t"+cust.getAddr().getState());
		System.out.println("\tPincode\t\t\t:\t\t"+cust.getAddr().getPincode());
		
		System.out.println("\n\tProduct Purchase : ");
		System.out.println("\tProduct Id\t\t:\t\t"+cust.getProd().getProdId());
		System.out.println("\tProduct Name\t\t:\t\t"+cust.getProd().getProdName());
		System.out.println("\tProduct Price\t\t:\t\t"+cust.getProd().getProdPrice());
		System.out.println("\tProduct Quantity\t:\t\t"+cust.getProd().getProdQty());
		
		System.out.println("\n\t**Bill : ");
		System.out.println("\tBill No\t\t\t:\t\t"+bill.getBillNo());
		System.out.println("\tDate\t\t\t:\t\t"+bill.getDate());
		System.out.println("\tTotal\t\t\t:\t\t"+bill.getTotal());
		System.out.println("\tCgst\t\t\t:\t\t"+bill.getCgst());
		System.out.println("\tSgst\t\t\t:\t\t"+bill.getSgst());
		System.out.println("\tFinal Total\t\t:\t\t"+bill.getFinalTotal());
		
	}

}
