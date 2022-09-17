
import java.util.Scanner;
import java.util.Date;

public class ShopingInfo {

	private int customerLimit = 100;
	private int purhcaseLimit = 100;
	private int customerCount = 0;
	
	Scanner sc = new Scanner(System.in);

	public Customer[] createCustArr() {
		
		Customer cArr[] = new Customer[customerLimit];
		return cArr;
	}
	
	public void addCustomer(Customer custArr[]) {
		
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
			pArr[cnt++] = new Product(prodId, prodName, price, qty);
			System.out.println("Continue Purchase(Y/N) : ");
			ch = sc.next();
		
		}while(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("yes"));	
		
		Customer cust = new Customer(custId, custName, sal, addr, pArr);
		cust.setPurhcaseCnt(cust.getPurhcaseCnt()+cnt);
		custArr[customerCount] = cust;
		customerCount++;
		System.out.println("customerCount : "+customerCount);
	}
	
	public void addProduct(Customer custArr[]) {
		
		System.out.println("Enter Customer Id to add Product : ");
		int custId = sc.nextInt();
		Customer cust = searchCust(custArr, custId);
		
		String ch;
		int cnt = 0;
		if(cust != null) {
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
				Product p = new Product(prodId, prodName, price, qty);
				cust.getProd()[cust.getPurhcaseCnt()] = p;
				cust.setPurhcaseCnt(cust.getPurhcaseCnt()+1);
				
				System.out.println("Continue Purchase(Y/N) : ");
				ch = sc.next();
			
			}while(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("yes"));	
		}
		else {
			System.out.println("Customer does NOT Exist.!");
		}
	}
	
	public Customer searchCust(Customer custArr[], int custId) {
		
		Customer cust = null;
		for(int i=0; i<customerCount; i++) {
			if(custId == custArr[i].getCustId()) {
				return custArr[i];
			}
		}
		return cust;
	}
	
	public Bill calculateBill(Customer custArr[], int custId) {
		
		Customer cust = searchCust(custArr, custId);
		Bill bill = new Bill();
		
		if(cust != null) {
			double total = 0.0;
			double cgst = 0.0;
			double sgst = 0.0;
			double finalTotal = 0.0;
			
			for(int i=0; i<cust.getPurhcaseCnt(); i++) {
				
				total = total+cust.getProd()[i].getProdPrice()*cust.getProd()[i].getProdQty();
			}
			cgst = total*0.06;
			sgst = total*0.06;
			finalTotal = total+cgst+sgst;
			bill.setBillNo(1);
			bill.setTotal(total);
			bill.setCgst(cgst);
			bill.setSgst(sgst);
			bill.setFinalTotal(finalTotal);
			return bill;
		}
		return bill;
	}
	
	public void displayBill(Customer cust, Bill bill) {
		
			System.out.println("\n\t** Customer's Product Purchase **");
			System.out.println("\n\tProduct Id\tProduct Name\tProduct Price\tProduct Quantity");
			for(int j=0; j<cust.getPurhcaseCnt(); j++) {
				System.out.println("\t\t"+cust.getProd()[j].getProdId()+"\t\t"+cust.getProd()[j].getProdName()+"\t\t"+cust.getProd()[j].getProdPrice()+"\t\t"+cust.getProd()[j].getProdQty());
			}
			
			System.out.println("\n\tCustomer's Bill : ");
			System.out.println("\tBill Number\t\t:\t\t"+bill.getBillNo());
			System.out.println("\tDate\t\t\t:\t\t"+bill.getDate());
			System.out.println("\tTotal\t\t\t:\t\t"+bill.getTotal());
			System.out.println("\tCgst\t\t\t:\t\t"+bill.getCgst());
			System.out.println("\tSgst\t\t\t:\t\t"+bill.getSgst());
			System.out.println("\tFinal Total\t\t:\t\t"+bill.getFinalTotal());
		
	}
	
	public void display(Customer custArr[]) {
		
		System.out.println("\nEnter Customer Id to Display Customer Information");
		int custId = sc.nextInt();
		Customer cust = searchCust(custArr, custId);
		
		Bill bill = calculateBill(custArr, custId);
		
		if(cust != null) {
			
			System.out.println("\n\n------------------------------- Customer Information ----------------------\n\n");
			System.out.println("\tCustomer Id\t\t:\t\t"+cust.getCustId());
			System.out.println("\tCustomer Name\t\t:\t\t"+cust.getCustName());
			System.out.println("\tCustomer Salary\t\t:\t\t"+cust.getCustSal());
			
			System.out.println("\n\t** Customer Address : \n");
			System.out.println("\tCity\t\t\t:\t\t"+cust.getAddr().getCity());
			System.out.println("\tState\t\t\t:\t\t"+cust.getAddr().getState());
			System.out.println("\tPincode\t\t\t:\t\t"+cust.getAddr().getPincode());
			
			System.out.println("\n\t** Customer's Product Purchase : ");
			System.out.println("\n\tProduct Id\tProduct Name\tProduct Price\tProduct Quantity");
			for(int j=0; j<cust.getPurhcaseCnt(); j++) {
				System.out.println("\t\t"+cust.getProd()[j].getProdId()+"\t\t"+cust.getProd()[j].getProdName()+"\t\t"+cust.getProd()[j].getProdPrice()+"\t\t"+cust.getProd()[j].getProdQty());
			}
			
			System.out.println("\n\tCustomer's Bill : ");
			System.out.println("\tBill Number\t\t:\t\t"+bill.getBillNo());
			System.out.println("\tDate\t\t\t:\t\t"+bill.getDate());
			System.out.println("\tTotal\t\t\t:\t\t"+bill.getTotal());
			System.out.println("\tCgst\t\t\t:\t\t"+bill.getCgst());
			System.out.println("\tSgst\t\t\t:\t\t"+bill.getSgst());
			System.out.println("\tFinal Total\t\t:\t\t"+bill.getFinalTotal());
			
		}
		else {
			System.out.println("\nCustomer does NOT Exist.!");
		}
		
}
	
// All Operations on multiple Customers ...
	public Customer[] createCustomer() {
		
		Customer cArr[] = new Customer[customerLimit];
		System.out.println("How many customers do you want :");
		customerCount = sc.nextInt();
		
		
		for(int i=0; i<customerCount; i++) {
			
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
	
	public Bill[] calculateBillForAll(Customer custArr[]) {
		
		Bill bArr[] = new Bill[custArr.length];
		System.out.println("\ncust id : "+custArr[0].getCustId());
		for(int j=0; j<customerCount; j++) {
		
			System.out.println("j : "+j);
			System.out.println("\ncut id : "+custArr[0].getCustId());
			double total = 0.0;
			double cgst = 0.0;
			double sgst = 0.0;
			double finalTotal = 0.0;
			
			for(int i=0; i<custArr[j].getPurhcaseCnt(); i++) {
				
				total = total+custArr[j].getProd()[i].getProdPrice()*custArr[j].getProd()[i].getProdQty();
			}
			cgst = total*0.06;
			sgst = total*0.06;
			finalTotal = total+cgst+sgst;
			Bill bill = new Bill(1, new Date(), total, cgst, sgst, finalTotal);
			bArr[j] = bill;
		}
		return bArr;
	}
	
	
	public void displayAll(Customer custArr[], Bill bill[]) {
		
		System.out.println("\n\n------------------------------- Customer Information ----------------------\n\n");
		
		for(int i=0; i<customerCount; i++) {
			System.out.println("\n........................ Customer "+(i+1)+" .......................\n");
			System.out.println("\tCustomer Id\t\t:\t\t"+custArr[i].getCustId());
			System.out.println("\tCustomer Name\t\t:\t\t"+custArr[i].getCustName());
			System.out.println("\tCustomer Salary\t\t:\t\t"+custArr[i].getCustSal());
			
			System.out.println("\n\t** Customer Address : ");
			System.out.println("\tCity\t\t\t:\t\t"+custArr[i].getAddr().getCity());
			System.out.println("\tState\t\t\t:\t\t"+custArr[i].getAddr().getState());
			System.out.println("\tPincode\t\t\t:\t\t"+custArr[i].getAddr().getPincode());
			
			System.out.println("\n\t** Customer's Product Purchase : ");
			System.out.println("\n\tProduct Id\tProduct Name\tProduct Price\tProduct Quantity");
			for(int j=0; j<custArr[i].getPurhcaseCnt(); j++) {
				System.out.println("\t\t"+custArr[i].getProd()[j].getProdId()+"\t\t"+custArr[i].getProd()[j].getProdName()+"\t\t"+custArr[i].getProd()[j].getProdPrice()+"\t\t"+custArr[i].getProd()[j].getProdQty());
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
