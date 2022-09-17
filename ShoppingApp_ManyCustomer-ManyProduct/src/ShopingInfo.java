import java.util.Scanner;
import java.util.Date;

public class ShopingInfo {

	Scanner sc = new Scanner(System.in);
	private int purhcaseLimit = 100;
	public Customer[] createCustomer() {
		
		
		System.out.println("How many customers do you want :");
		int custNo = sc.nextInt();
		Customer cArr[] = new Customer[custNo];
		
		for(int i=0; i<custNo; i++) {
			
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
			
			
			//System.out.println("How many products do you want : ");
			//n = sc.nextInt();
			Product pArr[] = new Product[purhcaseLimit];
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
			cArr[i] = new Customer(custId, custName, sal, addr, pArr);
			cArr[i].setPurhcaseCnt(cnt);
		}	
		return cArr;
	}
	
	public Bill[] calculateBill(Customer cust[]) {
		
		Bill bArr[] = new Bill[cust.length];
		
		for(int j=0; j<cust.length; j++) {
		
			double total = 0.0;
			double cgst = 0.0;
			double sgst = 0.0;
			double finalTotal = 0.0;
			
			for(int i=0; i<cust[j].getPurhcaseCnt(); i++) {
				
				total = total+cust[j].getProd()[i].getProdPrice()*cust[j].getProd()[i].getProdQty();
			}
			cgst = total*0.06;
			sgst = total*0.06;
			finalTotal = total+cgst+sgst;
			Bill bill = new Bill(1, new Date(), total, cgst, sgst, finalTotal);
			bArr[j] = bill;
		}
		return bArr;
	}
	
	public void display(Customer cust[], Bill bill[]) {
		
		System.out.println("\n\n------------------------------- Customer Information ----------------------\n\n");
		
		for(int i=0; i<cust.length; i++) {
			System.out.println("\n........................ Customer "+(i+1)+" .......................\n");
			System.out.println("\tCustomer Id\t\t:\t\t"+cust[i].getCustId());
			System.out.println("\tCustomer Name\t\t:\t\t"+cust[i].getCustName());
			System.out.println("\tCustomer Salary\t\t:\t\t"+cust[i].getCustSal());
			
			System.out.println("\n\t** Customer Address : ");
			System.out.println("\tCity\t\t\t:\t\t"+cust[i].getAddr().getCity());
			System.out.println("\tState\t\t\t:\t\t"+cust[i].getAddr().getState());
			System.out.println("\tPincode\t\t\t:\t\t"+cust[i].getAddr().getPincode());
			
			System.out.println("\n\t** Customer's Product Purchase : ");
			System.out.println("\n\tProduct Id\tProduct Name\tProduct Price\tProduct Quantity");
			for(int j=0; j<cust[i].getPurhcaseCnt(); j++) {
				System.out.println("\t\t"+cust[i].getProd()[j].getProdId()+"\t\t"+cust[i].getProd()[j].getProdName()+"\t\t"+cust[i].getProd()[j].getProdPrice()+"\t\t"+cust[i].getProd()[j].getProdQty());
			}
			
			System.out.println("\n\tCustomer's Bill : ");
			System.out.println("\tBill Number\t\t:\t\t"+bill[i].getBillNo());
			System.out.println("\tDate\t\t\t:\t\t"+bill[i].getDate());
			System.out.println("\tTotal\t\t\t:\t\t"+bill[i].getTotal());
			System.out.println("\tCgst\t\t\t:\t\t"+bill[i].getCgst());
			System.out.println("\tSgst\t\t\t:\t\t"+bill[i].getSgst());
			System.out.println("\tFinal Total\t\t:\t\t"+bill[i].getFinalTotal());
		}
	}

}
