import java.util.Scanner;
import java.util.Date;

public class BankInfo {

	Scanner sc = new Scanner(System.in);
	public Account[] createAccount() {
		
		System.out.println("How many Account you want to create : ");
		int n = sc.nextInt();
		Account accArr[] = new Account[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter Account Number : ");
			int accNo = sc.nextInt();
			System.out.println("Enter Account Holder's Name : ");
			String name = sc.next();
			System.out.println("Enter Account Balance : ");
			double bal = sc.nextDouble();
			System.out.println("Enter Account Password : ");
			String pass = sc.next();
			//Account acc = 
			accArr[i] = new Account(accNo, name, new Date(), bal, pass);
		}
		return accArr;
	}
	
	public void display(Account accArr[]) {
		
		for(int i=0; i<accArr.length; i++) {
			
			System.out.println("\n\t--------------------- Account "+(i+1)+" ---------------------");
			System.out.println("\tAccount Number\t\t\t:\t\t"+accArr[i].getAccNo());
			System.out.println("\tAccount Holder's Name\t\t:\t\t"+accArr[i].getCustName());
			System.out.println("\tAccount Creation Date\t\t:\t\t"+accArr[i].getAccCreationDt());
			System.out.println("\tAccount Balance\t\t\t:\t\t"+accArr[i].getAccBal());
			System.out.println("\tAccount Password\t\t:\t\t********");
		}
		
	}
	
	public Account searchAccount(Account accArr[], int accNo) {
		
		Account acc = null;
		//System.out.println("Enter Account No to Search Account : ");
		//int accNo = sc.nextInt();
		for(int i=0; i<accArr.length; i++) {
			if(accNo == accArr[i].getAccNo()) {
				acc = accArr[i];
				break;
			}
		}
		return acc;
	}
	
	public boolean withrawal(Account accArr[]) {
		
		boolean flag = false;
		System.out.println("Enter Account No to Withraw Money : ");
		int accNo = sc.nextInt();
		Account temp = searchAccount(accArr, accNo);
		
		if(temp != null) {
			System.out.println("Enter Amount to withraw : ");
			double amt = sc.nextDouble();
			if(amt < (temp.getAccBal()-200)) {
				temp.setAccBal(temp.getAccBal() - amt);
				flag = true;
			}
			else {
				System.out.println("Transaction Cancelled..\nInsufficient Balance..!");
			}
		
		}
		else {
			System.out.println("Cannot Proceed Furthur..\nAccount Does not Exist.!");
		}
		return flag;
		
	}
	
	public boolean deposit(Account accArr[]) {
		
		boolean flag = false;
		System.out.println("Enter Account Number to deposit Amount : ");
		int accNo = sc.nextInt();
		Account temp = searchAccount(accArr, accNo);
		if(temp != null) {
			System.out.println("Enter Amount to Deposit");
			double amt = sc.nextDouble();
			temp.setAccBal(temp.getAccBal()+amt);
			flag = true;
		}
		else {
			System.out.println("Cannot Proceed Further..\nAccount Does not Exist.!");
		}
		return flag;
	}
	
	
}
