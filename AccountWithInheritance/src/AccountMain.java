
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		AccountInfo aInfo = new AccountInfo();
		Customer cust = aInfo.createAccount();
		aInfo.display(cust);
	}

}
