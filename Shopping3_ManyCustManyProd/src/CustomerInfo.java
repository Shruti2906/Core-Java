
import java.util.Date;
import java.util.Scanner;
public class CustomerInfo {
	
	public Customer[] create() {
		
		Scanner sc = new Scanner(System.in);
		
	//    Hard Coded Values ....
	
	/*	Customer cust[] = new Customer[2];
		
		// Customer 1 ..
	    Product[] prodar1 = new Product[2];
		Product prod1 = new Product(101, "Laptop", 70000, 1);
		Product prod2 = new Product(102, "Mobile", 50000, 2);
		prodar1[0] = prod1;
		prodar1[1] = prod2;
		Address ad1 = new Address("Pune", 411612, "MH", "India");
		Customer cust1 = new Customer(111, "John", ad1, prodar1);
		cust[0] = cust1;
		
		// Customer 2 ....
		Product[] prodar2 = new Product[2];
		Product prod11 = new Product(101, "Laptop", 70000, 1);
		Product prod22 = new Product(102, "Mobile", 50000, 2);
		prodar2[0] = prod11;
		prodar2[1] = prod22;
		Address ad2 = new Address("Pune", 411612, "MH", "India");
		Customer cust2 = new Customer(111, "John", ad2, prodar2);
		cust[1] = cust2;
		*/
		
	 // Dynamic Values From User ..
	   
		//Address ad = new Address();
	
		int custn;
		System.out.println("How Many Customers you want : ");
		custn = sc.nextInt();
		Customer[] cust = new Customer[custn];
		
		for(int i=0; i<custn; i++) {
			
			Customer custTemp = new Customer();
			System.out.println("\n-----------Enter Customer "+(i+1)+" Details------------\n");
			System.out.println("Enter Customer Id : ");
			custTemp.setCustId(sc.nextInt());
			System.out.println("Enter Customer Name : ");
			custTemp.setCustName(sc.next());
			
			Address ad = new Address();
			System.out.println("\nEnter Address Details .... ");
			System.out.println("Enter City : ");
			ad.setCity(sc.next());
			System.out.println("Enter pincode : ");
			ad.setPincode(sc.nextInt());
			System.out.println("Enter State : ");
			ad.setState(sc.next());
			System.out.println("Enter Country : ");
			ad.setCountry(sc.next());
			custTemp.setCustAddress(ad);
			
			int n;
			System.out.println("\nEnter Product Details ............");
			System.out.println("How many Products you want : ");
			n = sc.nextInt();
			Product[] prod = new Product[n];
			for(int j=0; j<n; j++) {
				
				System.out.println("\nProduct "+(j+1)+" : ");
				Product prodtemp = new Product();
				System.out.println("Enter Product Id : ");
				prodtemp.setProdId(sc.nextInt());
				System.out.println("Enter Product Name : ");
				prodtemp.setProdName(sc.next());
				System.out.println("Enter Product Price : ");
				prodtemp.setProdPrice(sc.nextFloat());
				System.out.println("Enter Product Qty : ");
				prodtemp.setProdQty(sc.nextInt());
				prod[j] = prodtemp;
			}
		
			custTemp.setCustProd(prod);
		
			
			cust[i] = custTemp;
		}
		
		return cust;
		
	}
	
	public void calculateBill(Customer[] cust) {
		
		double total = 0;
		double cgst;
		double sgst;
		double finalTotal;
		for(int i=0; i<cust.length; i++) {
			
			for(int j=0; j<cust[i].getCustProd().length; j++) {
			
				total += cust[i].getCustProd()[j].getProdPrice() * cust[i].getCustProd()[j].getProdQty();
			
			}
			cgst = total*1.1;
			sgst = total*2.1;
			finalTotal = total+cgst+sgst;
			Bill bill = new Bill(total, cgst, sgst, finalTotal, new Date());
			cust[i].setBill(bill);
			
		}
		
	}
	
	public void display(Customer[] cust) {
		
		System.out.println("\n\n\n\n\n");
		for(int i=0; i<cust.length; i++) {
			
			System.out.println("\n\n============================ Customer "+(i+1)+" Details ============================");
			
			System.out.println("Customer Id : "+cust[i].getCustId());
			System.out.println("Customer Name : "+cust[i].getCustName());
			
			System.out.println("-----------------------------Address Details-------------------------------");
			//cust.getCustAdress will return address object reference
			//through which city variable can be accessed..
			System.out.println("City : "+cust[i].getCustAddress().getCity());
			System.out.println("Pincode : "+cust[i].getCustAddress().getPincode());
			System.out.println("State : "+cust[i].getCustAddress().getState());
			System.out.println("Country : "+cust[i].getCustAddress().getCountry());
			
			System.out.println("-----------------------------Product Details-----------------------------");
		
			for(int j=0; j<cust[i].getCustProd().length; j++) {
				
				System.out.println("\nProduct "+(i+1)+" : ");
				System.out.println("Product Id : "+cust[i].getCustProd()[j].getProdId());
				System.out.println("Product Name : "+cust[i].getCustProd()[j].getProdName());
				System.out.println("Product Price : "+cust[i].getCustProd()[j].getProdPrice());
				System.out.println("Product Quantity : "+cust[i].getCustProd()[j].getProdQty());
			}
			
			System.out.println("-----------------------------Bill Details-----------------------------");
		
			 	System.out.println("Date : "+cust[i].getBill().getDate());
				System.out.println("Total : "+cust[i].getBill().getTotal());
				System.out.println("CGST : "+cust[i].getBill().getCgst());
				System.out.println("SGST : "+cust[i].getBill().getSgst());
				System.out.println("Final TOtal : "+cust[i].getBill().getFinalTotal());
		
		}
		
		System.out.println("\n\n=================================THANK YOU !!======================================");
		
		
	}

}
