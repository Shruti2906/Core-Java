import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			BankInfo bInfo = new BankInfo();
			Account accArr[] = null; 
			Account temp = null;
			
			String str;
			int ch;
			do {
				System.out.println("1 : Create\n2 : Display\n3 : Search\n4 : Transaction");
				ch = sc.nextInt();
				switch(ch) {
					case 1:
							accArr = bInfo.createAccount();
							System.out.println("Account Created Successfully..!");
						break;
					case 2:
							bInfo.display(accArr);
						break;
					case 3:
							System.out.println("Enter Account No to Search Account : ");
							int accNo = sc.nextInt();
							if((temp = bInfo.searchAccount(accArr, accNo)) != null) {
								System.out.println("Account No : "+temp.getAccNo());
								System.out.println("Account Name : "+temp.getCustName());
								System.out.println("Account Creation Date : "+temp.getAccCreationDt());
								System.out.println("Account Balance : "+temp.getAccBal());
							}
							else {
								System.out.println("No Account Exist..!!");
							}
						break;
					case 4:
							System.out.println("\n1 : Withdrawal\n2 : Deposit");
							System.out.println("Enter your choice : ");
							int chh = sc.nextInt();
							if(chh == 1) {
								
								if(bInfo.withrawal(accArr)) {
									System.out.println("Widrawal Successfull.!");
								}
								
							}
							else if(chh == 2) {
								if(bInfo.deposit(accArr)) {
									System.out.println("Deposit Successfull.!");
								}
							}
							else {
								System.out.println("Cannot Proceed Further..\nInvalid Choice.!!");
							}
						break;
					default: System.out.println("Invalid choice.!");
				}
				System.out.println("\nDo You want to continue (Y/N) : ");
				str = sc.next();
			}while(str.equalsIgnoreCase("Yes") || str.equalsIgnoreCase("Y"));
			
			System.out.println("\n\nThank You..!!");
	}

}
