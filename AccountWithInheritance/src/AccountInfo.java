import java.util.Scanner;

public class AccountInfo {

		private static int AccountLimit = 2;
		
		public Customer createAccount() {
			
			Scanner sc = new Scanner(System.in);
		
			Customer cust1 = null;

			System.out.println("Enter Customer Id : ");
			int id = sc.nextInt();
			System.out.println("Enter Customer Name : ");
			String name = sc.next();
			System.out.println("Enter Customer Mobile No : ");
			String no = sc.next();
				
			Account aArr[] = new Account[AccountLimit];
			String ch;
			int cnt = 0;
			do {

				System.out.println("Enter Account No : ");
				int acno = sc.nextInt();
				System.out.println("Select Account Type : ");
				System.out.println("1] Saving\t2] Current : ");
				int ty = sc.nextInt();
				
				if(ty == 1) {
					System.out.println("Enter Account Balance : ");
					double bal = sc.nextDouble();
					if(bal >= 500) {
						
						aArr[cnt++] = new SavingAccount(acno, "Saving", bal);
						//custArr[cnt++] = new Customer(id, name, no, sAcc);
					}
					else {
						System.out.println("Minimum Balance for Saving Account : 500 INR");
					//	System.out.println("1]Try Again\t2]Skip Account");
					}
					
				}
				else if(ty == 2) {
					System.out.println("Enter Account Balance : ");
					double bal = sc.nextDouble();
					System.out.println("Enter Company Name : ");
					String company = sc.next();
					aArr[cnt++] = new CurrentAccount(acno, "Current", bal, company);
					//cust1 = new Customer(id, name, no, cAcc);
					
				}
				else {
					System.out.println("Invalid choice..");
				}
				System.out.println("Do You Want to Open More Accounts(Y/N) : ");
				ch = sc.next();
			}while((ch.equalsIgnoreCase("y")) || (ch.equalsIgnoreCase("yes")) && (cnt < AccountLimit));
			
			cust1 = new Customer(id, name, no, aArr );
			cust1.setAccCount(cnt);
			return cust1;

		}
		
		public void display(Customer cust) {
			
			System.out.println("----------------------- Customer Details ----------------------------");
			
			System.out.println("Customer Id : "+cust.getCustId());
			System.out.println("Customer Name : "+cust.getCustName());
			System.out.println("Account Mobile No : "+cust.getCustMobNo());
			
			for(int i=0; i<cust.getAccCount(); i++) {
				System.out.println("\nAccount Number : "+cust.getAcc()[i].getAccNo());
				System.out.println("Account Type : "+cust.getAcc()[i].getAccType());
				System.out.println("Account Balance : "+cust.getAcc()[i].getAccBal());
				if(cust.getAcc()[i] instanceof SavingAccount) {
					//downCasting.. 
					SavingAccount sAcc = (SavingAccount)cust.getAcc()[i];
					System.out.println("Account Interest Rate : "+sAcc.getInterestRate());
				}
				else {
					CurrentAccount cAcc = (CurrentAccount)cust.getAcc()[i];
					System.out.println("Account Interest Rate : "+cAcc.getCompnyName());
				}
			}
		}
}
