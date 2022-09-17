
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println("n : "+n);
		
		sc.close();
		
		System.out.println("hi enter now : ");
		n = sc.nextInt();	//Exception in thread "main" java.lang.IllegalStateException: Scanner closed
		System.out.println("n : "+n);
	}
}
