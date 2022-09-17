
import java.util.Scanner;

public class EvenCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The no to find even numbers : ");
		int n = sc.nextInt();
		System.out.print("Even Numbers till "+n+" are : ");
		for(int i=2; i<=n; i++) {
			if(i %2 == 0) {
				System.out.print(i+" ");
			}
		}
	}
}
