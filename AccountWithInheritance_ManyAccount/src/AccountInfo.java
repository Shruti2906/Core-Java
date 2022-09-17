import java.util.Scanner;

public class AccountInfo {

		private static int CustomerLimit = 100;
		private static int AccountLimit = 2;
		private int customerCnt = 0;
		
		public Customer[] createAccount() {
			
			Customer custArr[] = new Customer[CustomerLimit];
			return custArr;
		}
		
		public void addAccount(Customer custArr[]) {
			
			Scanner sc = new Scanner(System.in);
		
			int cStatus;
			 System.out.println("\t\t1] New Customer \t2] Existing Customer");
			 cStatus = sc.nextInt();
		
			 if(cStatus == 1) {
			
				 addCustomer(custArr);
		
			 }
			 else if(cStatus == 2) {
			 
				 System.out.println("\tEnter Customer Id : ");
				 int custId = sc.nextInt();
				 Customer ct = searchCustomer(custArr, custId);
				 if(ct != null){
					 
					 if(ct.getAccCount() < AccountLimit) {
						 Account acc = null;
						 System.out.println("\tEnter Account No : ");
							int acno = sc.nextInt();
							System.out.println("\tSelect Account Type : ");
							System.out.println("\t1] Saving\t2] Current : ");
							int ty = sc.nextInt();
							
							if(ty == 1) {
								System.out.println("\tEnter Account Balance : ");
								double bal = sc.nextDouble();
								if(bal >= 500) {
									
									acc = new SavingAccount(acno, "Saving", bal);
									ct.getAcc()[ct.getAccCount()] = acc;
									ct.setAccCount(ct.getAccCount()+1);
								}
								else {
									System.out.println("\tMinimum Balance for Saving Account : 500 INR");
								//	System.out.println("1]Try Again\t2]Skip Account");
								}
								
							}
							else if(ty == 2) {
								System.out.println("\tEnter Account Balance : ");
								double bal = sc.nextDouble();
								System.out.println("\tEnter Company Name : ");
								String company = sc.next();
								acc = new CurrentAccount(acno, "Current", bal, company);
								ct.getAcc()[ct.getAccCount()] = acc;
								ct.setAccCount(ct.getAccCount()+1);
							}
							else {
								System.out.println("\n\tInvalid choice..");
							}
					 }
					 else {
						 System.out.println("\tOne Customer Can Have Atmost 2 Accounts..!!");
					 }
					 
				 }
				 else {
					 System.out.println("\tCustomer does not exist");
				 }
			 		
			 }
			 else {
				 System.out.println("\tInvalid Choice..");
			 }
	
		}
		
		public void addCustomer(Customer cArr[]) {
			
			Scanner sc = new Scanner(System.in);
			Customer cust = null;
			
			System.out.println("Enter Customer Id : ");
			int id = sc.nextInt();
			System.out.println("Enter Customer Name : ");
			String name = sc.next();
			System.out.println("Enter Customer Mobile No : ");
			String no = sc.next();
			
			Account aArr[] = new Account[AccountLimit];
			Account acc = null;
			
			System.out.println("Enter Account No : ");
			int acno = sc.nextInt();
			System.out.println("Select Account Type : ");
			System.out.println("1] Saving\t2] Current : ");
			int ty = sc.nextInt();
			
			if(ty == 1) {
				System.out.println("Enter Account Balance : ");
				double bal = sc.nextDouble();
				if(bal >= 500) {
					
					acc = new SavingAccount(acno, "Saving", bal);
					aArr[0] = acc;
					cust = new Customer(id, name, no, aArr);
					cust.setAccCount(1);
				}
				else {
					System.out.println("------------------------------------------------------------------------");
					System.out.println("Minimum Balance for Saving Account : 500 INR");
					System.out.println("------------------------------------------------------------------------");
				//	System.out.println("1]Try Again\t2]Skip Account");
				}
				
			}
			else if(ty == 2) {
				System.out.println("Enter Account Balance : ");
				double bal = sc.nextDouble();
				System.out.println("Enter Company Name : ");
				String company = sc.next();
				acc = new CurrentAccount(acno, "Current", bal, company);
				aArr[0] = acc;
				cust = new Customer(id, name, no, aArr);
				cust.setAccCount(1);
			}
			else {
				System.out.println("Invalid choice..");
			}
			
			cArr[customerCnt] = cust;
			customerCnt++;
		}
		
		public Customer searchCustomer(Customer custArr[], int custId) {
			
			Customer cust = null;
			for(int i=0; i<customerCnt; i++) {
				if(custId == custArr[i].getCustId()) {
					return custArr[i];
				}
			}
			return cust;
		}
		public void display(Customer cArr[], int custId) {
			
			Customer cust = searchCustomer(cArr, custId);
			
			if(cust != null) {
					
					System.out.println("---------------------------- Customer Details --------------------------------");
					
					System.out.println("\tCustomer Id\t\t:\t\t"+cust.getCustId());
					System.out.println("\tCustomer Name\t\t:\t\t"+cust.getCustName());
					System.out.println("\tAccount Mobile No\t:\t\t"+cust.getCustMobNo());
					
					for(int j=0; j<cust.getAccCount(); j++) {
						System.out.println("\n\tAccount Number\t\t:\t\t"+cust.getAcc()[j].getAccNo());
						System.out.println("\tAccount Type\t\t:\t\t"+cust.getAcc()[j].getAccType());
						System.out.println("\tAccount Balance\t\t:\t\t"+cust.getAcc()[j].getAccBal());
						if(cust.getAcc()[j] instanceof SavingAccount) {
							//downCasting.. 
							SavingAccount sAcc = (SavingAccount)cust.getAcc()[j];
							System.out.println("\tAccount Interest Rate\t:\t\t"+sAcc.getInterestRate());
						}
						else {
							CurrentAccount cAcc = (CurrentAccount)cust.getAcc()[j];
							System.out.println("\tCompany Name\t\t:\t\t"+cAcc.getCompnyName());
						}
					}
				
			}
			
		}

		public void display(Customer cArr[]) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Customer Id : ");
			int custId = sc.nextInt();
			
			Customer cust = searchCustomer(cArr, custId);
			
			if(cust != null) {
			
					System.out.println("Enter Account No : ");
					int acNo = sc.nextInt();
					for(int j=0; j<cust.getAccCount(); j++) {
					
					if(acNo == cust.getAcc()[j].getAccNo()) {
						System.out.println("-------------------------- Account Details -----------------------------");
						
						System.out.println("\n\tAccount Number\t\t:\t\t"+cust.getAcc()[j].getAccNo());
						System.out.println("\tAccount Type\t\t:\t\t"+cust.getAcc()[j].getAccType());
						System.out.println("\tAccount Balance\t\t:\t\t"+cust.getAcc()[j].getAccBal());
						if(cust.getAcc()[j] instanceof SavingAccount) {
							//downCasting.. 
							SavingAccount sAcc = (SavingAccount)cust.getAcc()[j];
							System.out.println("\tAccount Interest Rate\t:\t\t"+sAcc.getInterestRate());
						}
						else {
							CurrentAccount cAcc = (CurrentAccount)cust.getAcc()[j];
							System.out.println("\tCompany Name\t:\t\t"+cAcc.getCompnyName());
						}
						break;
					}
					else {
						System.out.println("------------------------------------------------------------------------");
						System.out.println("Account Does NOT Exist.!");
						System.out.println("------------------------------------------------------------------------");
					}
				}
			}
		}
			
}
