import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ShopInfo {

	private final static int custLimit = 100;
	private int purhcaseLimit = 100;
	private int customerCount = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public Customer[] createCustomer() {
		Customer custArr[] = new Customer[custLimit];
		return custArr;
	}
	
	public void addCustomer(Customer custArr[]) throws ParseException {
		
		System.out.println("\tEnter Customer Id : ");
		int cId = sc.nextInt();
		System.out.println("\tEnter Customer Name : ");
		String cname = sc.next();
		System.out.println("\tEnter Date Of Birth : ");
		String sDate = sc.next();
		Date date = new SimpleDateFormat("DD/MM/YYYY").parse(sDate);
		
		System.out.println("\t--- Address Details : ");
		System.out.println("\tEnter City : ");
		String city = sc.next();
		System.out.println("\tEnter State : ");
		String st = sc.next();
		System.out.println("\tEnter pinCode : ");
		String pincode = sc.next();
		Address addr = new Address(city, st, pincode); 
		
		Product pArr[] = new Product[purhcaseLimit];
		int cnt = 0;
		
		String ch;
		System.out.println("\n\tEnter Customer's Product Purchase .....\n");
		do {
			Product prod = null;
			System.out.println("\tEnter Product Id : ");
			int id =  sc.nextInt();
			System.out.println("\tEnter Product Name ");
			System.out.println("\t1] Book\n\t2] Laptop : ");
			int name = sc.nextInt();
			if(name == 1) {
				System.out.println("\tEnter Product Price : ");
				double price = sc.nextDouble();
				System.out.println("\tEnter Product Quantity : ");
				int qty = sc.nextInt();
				System.out.println("\tEnter Book Author : ");
				String author = sc.next();
				System.out.println("\tEnter Book Genere : ");
				String genere = sc.next();
				System.out.println("\tEnter Book Publication : ");
				String publication = sc.next();
				pArr[cnt++] = new Book(id, "Book", price, qty, author, genere, publication);
				
			}
			else if(name == 2) {
				System.out.println("\tEnter Product Price : ");
				double price = sc.nextDouble();
				System.out.println("\tEnter Product Quantity : ");
				int qty = sc.nextInt();
				System.out.println("\tEnter Hard Disk Capacity : ");
				float hdd = sc.nextFloat();
				System.out.println("\tEnter Operating system Installed : ");
				String os = sc.next();
				System.out.println("\tEnter CPU ");
				System.out.println("\t1] Intel\t2]AMD\t:\t");
				int ccpu = sc.nextInt();
				System.out.println("\tEnter Laptop RAM : ");
				int ram = sc.nextInt();
				if(ccpu == 1) {
					pArr[cnt++] = new Laptop(id, "Laptop", price, qty, hdd, os, "Intel", ram);
				}
				else{
					pArr[cnt++] = new Laptop(id, "Laptop", price, qty, hdd, os, "AMD", ram);
				}
			}
			
			System.out.println("\tContinue Purchase(Y/N) : ");
			ch = sc.next();
		
		}while((ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("yes")) && (cnt < purhcaseLimit));
		
			Customer cust = new Customer(cId, cname, date, addr, pArr);
			custArr[customerCount] = cust;
			cust.setPurhcaseCnt(cust.getPurhcaseCnt()+cnt);
			customerCount++;
		
	}
	
	public void display(Customer cust[]) {
		
		for(int i=0; i<customerCount; i++) {
			System.out.println("\n------------------------ Customer Details -----------------------------");
			
			System.out.println("\tCustomer Id\t\t:\t\t"+cust[i].getCustId());
			System.out.println("\tCustomer Name\t\t:\t\t"+cust[i].getCustName());
			System.out.println("\tCustomer Date Of Birth\t:\t\t"+cust[i].getDob());
			
			System.out.println("\n\tCity\t\t\t:\t\t"+cust[i].getAddr().getCity());
			System.out.println("\tState\t\t\t:\t\t"+cust[i].getAddr().getState());
			System.out.println("\tpincode\t\t\t:\t\t"+cust[i].getAddr().getPincode());
			
			System.out.println("\tProduct Id\tProduct Name\tProduct Price\t Product Quantity");
			
			for(int j=0; j<cust[i].getPurhcaseCnt(); j++) {
				
				System.out.println("\t"+cust[i].getProd()[j].getProdId()+"\t"+cust[i].getProd()[j].getProdName()+"\t"+cust[i].getProd()[j].getProdPrice()+"\t"+cust[i].getProd()[j].getProdQty());
				
				if(cust[i].getProd()[j] instanceof Book) {
					Book book = (Book)cust[i].getProd()[j];
					System.out.println("\tBook Author\t\t:\t\t"+book.getBookAuthor());
					System.out.println("\tBook Genere\t\t:\t\t"+book.getBookGenere());
					System.out.println("\tBook Publication\t:\t\t"+book.getBookPublication());
				}
				if(cust[i].getProd()[j] instanceof Laptop) {
					Laptop l = (Laptop)cust[i].getProd()[j];
					System.out.println("\tHDD Capacity\t\t:\t\t"+l.getLaptopHDDCapacity());
					System.out.println("\tCPU \t\t\t:\t\t"+l.getLaptopCPU());
					System.out.println("\tRAM \t\t\t:\t\t"+l.getLaptopRam());
					System.out.println("\tOperating System\t:\t\t"+l.getLaptopOs());
				}
			}
		}	
	}
	
	public boolean addProduct(Customer custArr[]) {
		
		System.out.println("Enter Customer Id : ");
		int id = sc.nextInt();
		Customer cust = searchAccount(custArr, id);
		Product p = null;
		
		String ch;
		if(cust != null) {
			System.out.println("\nEnter Customer's Product Purchase .....\n");
			do {
				System.out.println("Enter Product Id : ");
				int prodId = sc.nextInt();
				
				System.out.println("Enter Product Name ");
				System.out.println("1] Book\n2] Laptop : ");
				int name = sc.nextInt();
				if(name == 1) {
					System.out.println("Enter Product Price : ");
					double price = sc.nextDouble();
					System.out.println("Enter Product Quantity : ");
					int qty = sc.nextInt();
					System.out.println("Enter Book Author : ");
					String author = sc.next();
					System.out.println("Enter Book Genere : ");
					String genere = sc.next();
					System.out.println("Enter Book Publication : ");
					String publication = sc.next();
					p = new Book(prodId, "Book", price, qty, author, genere, publication);
					
				}
				else if(name == 2) {
					System.out.println("Enter Product Price : ");
					double price = sc.nextDouble();
					System.out.println("Enter Product Quantity : ");
					int qty = sc.nextInt();
					System.out.println("Enter Hard Disk Capacity : ");
					float hdd = sc.nextFloat();
					System.out.println("Enter Operating system Installed : ");
					String os = sc.next();
					System.out.println("Enter CPU ");
					System.out.println("1] Intel\t2]AMD\t:\t");
					int ccpu = sc.nextInt();
					System.out.println("Enter Laptop RAM : ");
					int ram = sc.nextInt();
					if(ccpu == 1) {
						p = new Laptop(prodId, "Laptop", price, qty, hdd, os, "Intel", ram);
					}
					else{
						p = new Laptop(prodId, "Laptop", price, qty, hdd, os, "AMD", ram);
					}
				}
				
				cust.getProd()[cust.getPurhcaseCnt()] = p;
				cust.setPurhcaseCnt(cust.getPurhcaseCnt()+1);
				
				System.out.println("Continue Purchase(Y/N) : ");
				ch = sc.next();
			
			}while(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("yes"));
			return true;
		}
		else {
			System.out.println("Account Does NOT Exist..");
			return false;
		}
		
	}

	public Customer searchAccount(Customer custArr[], int custId) {
		
		Customer cust = null;
		
		for(int i=0; i<customerCount; i++) {
			if(custId == custArr[i].getCustId()) {
				return custArr[i];
			}
		}
		return cust;
	}
	
	public Bill calculateBill(Customer custArr[], int custId) {
		Customer cust = searchAccount(custArr, custId);
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
			System.out.println("\t\t"+cust.getProd()[j].getProdId()+"\t\t\t"+cust.getProd()[j].getProdName()+"\t\t\t"+cust.getProd()[j].getProdPrice()+"\t\t\t"+cust.getProd()[j].getProdQty());
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
