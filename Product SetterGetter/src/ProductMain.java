
import java.util.Scanner;
public class ProductMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Product[] pArray = new Product[2];
		Product p = new Product();
		Product p1 = new Product();
		
		//Hard coded value
		p.setPId(101);
		p.setPName("John");
		p.setPPrice(10000);
		
		pArray[0] = p;
	
		//Dynamic value
		System.out.println("Enter Employee Id : ");
		p1.setPId(sc.nextInt());
		System.out.println("Enter Employee Name : ");
		p1.setPName(sc.next());
		System.out.println("Enter Employee Salary : ");
		p1.setPPrice(sc.nextDouble());
		
		pArray[1] = p1;
		
		System.out.println("=================== Display ===============");
		
		for(int i=0; i<2; i++)
		{
			System.out.println("Account No : "+pArray[i].getPId());
			System.out.println("Account Holder Name : "+pArray[i].getPName());
			System.out.println("Account Balance : "+pArray[i].getPPrice());
			
		}

	}

}
