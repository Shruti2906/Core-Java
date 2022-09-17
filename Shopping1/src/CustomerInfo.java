
import java.util.Scanner;
public class CustomerInfo {
	
	public Customer create() {
		
		Scanner sc = new Scanner(System.in);
	//	Product prod = new Product(101, "Laptop", 50000, 1);
	//	Address ad = new Address("Pune", 411612, "MH", "India");
		
	//	Customer cust = new Customer(111, "John", ad, prod);
		
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
		
		Product prod = new Product();
		System.out.println("\nEnter Product Details ............");
		System.out.println("Enter Product Id : ");
		prod.setProdId(sc.nextInt());
		System.out.println("Enter Product Name : ");
		prod.setProdName(sc.next());
		System.out.println("Enter Product Price : ");
		prod.setProdPrice(sc.nextFloat());
		System.out.println("Enter Product Qty : ");
		prod.setProdQty(sc.nextInt());
		cust.setCustProd(prod);
		
		return cust;
		
	}
	
	public void display(Customer cust) {
		
		System.out.println("============================Customer Details============================");
		
		System.out.println("Customer Id : "+cust.getCustId());
		System.out.println("Customer Name : "+cust.getCustName());
		
		System.out.println("-----------------------------Product Details-----------------------------");
		System.out.println("Product Id : "+cust.getCustProd().getProdId());
		System.out.println("Product Name : "+cust.getCustProd().getProdName());
		System.out.println("Product Price : "+cust.getCustProd().getProdPrice());
		System.out.println("Product Quantity : "+cust.getCustProd().getProdQty());
		
		System.out.println("-----------------------------Address Details-------------------------------");
		//cust.getCustAdress will return address object reference
		//through which city variable can be accessed..
		System.out.println("City : "+cust.getCustAddress().getCity());
		System.out.println("Pincode : "+cust.getCustAddress().getPincode());
		System.out.println("State : "+cust.getCustAddress().getState());
		System.out.println("Country : "+cust.getCustAddress().getCountry());
		
		
		
		
		
	}

}
