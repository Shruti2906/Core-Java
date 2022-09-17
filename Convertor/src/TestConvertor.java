
import java.util.Scanner;
public class TestConvertor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Convertor C = new Convertor();
		
		String ch="YES";
		int chh;
		
		do {
			System.out.println("1 : Currency Convertor\n2 : Length Convertor \n3 : Volume Convertor ");
			System.out.println("Enter your choice : ");
			chh = sc.nextInt();
			switch(chh)
			{
			case 1:
					C.Currency();
					break;
			case 2:
					C.length();
					break;
			case 3:
					C.volume();
					break;
					
			default: System.out.println("Invalid choice..!!");
			}
			
			System.out.println("Do you want to continue?(Y/N) : ");
			ch = sc.next();
			
		}while(ch.equals("YES") || ch.equals("Y") || ch.equals("NO") || ch.equals("N") || ch.equals("y") || ch.equals("n"));
		
		System.out.println("\n\nThank You !!");
		
	}
	
}
