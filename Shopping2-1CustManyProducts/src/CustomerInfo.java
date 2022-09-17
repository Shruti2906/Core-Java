
import java.util.Scanner;
public class CustomerInfo {
	
	public Customer create() {
		
		Scanner sc = new Scanner(System.in);
		
	/*	
	    Hard Coded Values ....
	    Product[] prod = new Product[2];
		Product prod1 = new Product(101, "Laptop", 70000, 1);
		Product prod2 = new Product(102, "Mobile", 50000, 2);
		prod[0] = prod1;
		prod[1] = prod2;
		Address ad = new Address("Pune", 411612, "MH", "India");
		
		Customer cust = new Customer(111, "John", ad, prod);
		
	*/
		
		
	 // Dynamic Values From User ..
	    Customer cust = new Customer();
		Address ad = new Address();
		
		System.out.println("Enter Customer Id : ");
		cust.setCustId(sc.nextInt());
		System.out.println("Enter Customer Name : ");
		cust.setCustName(sc.next());
		
		System.out.println("\nEnter Address Details .... ");
		System.out.println("Enter City : ");
		ad.setCity(sc.next());
		System.out.println("Enter pincode : ");
		ad.setPincode(sc.nextInt());
		System.out.println("Enter State : ");
		ad.setState(sc.next());
		System.out.println("Enter Country : ");
		ad.setCountry(sc.next());
		cust.setCustAddress(ad);
		
		int n;
		System.out.println("\nEnter Product Details ............");
		System.out.println("How many Products you want : ");
		n = sc.nextInt();
		Product[] prod = new Product[n];
		for(int i=0; i<n; i++) {
			
			System.out.println("\nProduct "+(i+1)+" : ");
			Product prodtemp = new Product();
			System.out.println("Enter Product Id : ");
			prodtemp.setProdId(sc.nextInt());
			System.out.println("Enter Product Name : ");
			prodtemp.setProdName(sc.next());
			System.out.println("Enter Product Price : ");
			prodtemp.setProdPrice(sc.nextFloat());
			System.out.println("Enter Product Qty : ");
			prodtemp.setProdQty(sc.nextInt());
			prod[i] = prodtemp;
		}
	
		cust.setCustProd(prod);
		
		return cust;
		
	}
	
	public void calculateBill(Customer cust) {
		
		double total = 0;
		double cgst;
		double sgst;
		double finalTotal;
		for(int i=0; i<cust.getCustProd().length; i++) {
			
			total += cust.getCustProd()[i].getProdPrice() * cust.getCustProd()[i].getProdQty();
		}
		cgst = total*1.1;
		sgst = total*2.1;
		finalTotal = total+cgst+sgst;
		
		Bill bill = new Bill(total, cgst, sgst, finalTotal);
		
		cust.setBill(bill);
		
		
	}
	
	public void display(Customer cust) {
		
		System.out.println("============================Customer Details============================");
		
		System.out.println("Customer Id : "+cust.getCustId());
		System.out.println("Customer Name : "+cust.getCustName());
		
		System.out.println("-----------------------------Address Details-------------------------------");
		//cust.getCustAdress will return address object reference
		//through which city variable can be accessed..
		System.out.println("City : "+cust.getCustAddress().getCity());
		System.out.println("Pincode : "+cust.getCustAddress().getPincode());
		System.out.println("State : "+cust.getCustAddress().getState());
		System.out.println("Country : "+cust.getCustAddress().getCountry());
		
		System.out.println("-----------------------------Product Details-----------------------------");
		
		for(int i=0; i<cust.getCustProd().length; i++) {
			
			System.out.println("\nProduct "+(i+1)+" : ");
			System.out.println("Product Id : "+cust.getCustProd()[i].getProdId());
			System.out.println("Product Name : "+cust.getCustProd()[i].getProdName());
			System.out.println("Product Price : "+cust.getCustProd()[i].getProdPrice());
			System.out.println("Product Quantity : "+cust.getCustProd()[i].getProdQty());
		}
		
		System.out.println("-----------------------------Bill Details-----------------------------");
			
		System.out.println("Total : "+cust.getBill().getTotal());
		System.out.println("CGST : "+cust.getBill().getCgst());
		System.out.println("SGST : "+cust.getBill().getSgst());
		System.out.println("Final TOtal : "+cust.getBill().getFinalTotal());
		
		System.out.println("\n\n=================================THANK YOU !!======================================");
		
		
	}

}
