
import java.util.Scanner;

public class Test {

	private static int age;
	private static String nm;
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter age : ");
			age = sc.nextInt();
			if(age<=18) {
				throw new InvalidAgeException();
			}
			System.out.println("Enter Name : ");
			nm = sc.next();
			
			System.out.println("Age : "+age);
			System.out.println("Name : "+nm);
			
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}
		finally{
			System.out.println("\nFinally Thank you..");
		}
	}

}
