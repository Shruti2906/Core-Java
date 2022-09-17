
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		AccountInfo aInfo = new AccountInfo();
		Customer custArr[] = aInfo.createAccount();
		
		//1 : open account
		
		System.out.println("=============================================================================");
		System.out.println("**************************\tJM BANK\t\t***************************");
		System.out.println("=============================================================================");
		int ch;
		String str;
		do {
			System.out.println("\t\t\t1 : Open Account\n\t\t\t2 : Display Customer\n\t\t\t3 : Display Account ");
			System.out.println("\t\t\tEnter your choice :\t");
			ch = sc.nextInt();
			switch(ch) {
				case 1:
					aInfo.addAccount(custArr);
					System.out.println("------------------------------------------------------------------------");
					System.out.println("\t\tAccount Opned Successfuly.!");
					System.out.println("------------------------------------------------------------------------");
					break;
					
				case 2:
						System.out.println("\t\tEnter Customer Id : ");
						int id = sc.nextInt();
						aInfo.display(custArr, id);
						
					break;
				
				case 3:
					aInfo.display(custArr);
					break;
				
				default : System.out.println("Invalid choice : ");
			}
			
			System.out.println("Do You Want To goto Main Page (Y/N) : ");
			str = sc.next();
		}while((str.equalsIgnoreCase("y")) || (str.equalsIgnoreCase("yes")));
			
		System.out.println("Thank You ..!");
	}

}
