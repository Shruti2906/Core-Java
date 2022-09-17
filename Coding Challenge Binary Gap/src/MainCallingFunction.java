
import java.util.Scanner; 
public class MainCallingFunction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FindBinaryGap g = new FindBinaryGap();
		
		System.out.println("Enter any Integer within 0 to 647 : ");
		int n = sc.nextInt();		
		int sol = g.solution(n);
		System.out.println("Length of "+n+"'s longest binary gap is : "+sol);
		
	}

}
