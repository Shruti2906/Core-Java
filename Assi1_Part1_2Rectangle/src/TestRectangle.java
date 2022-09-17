
import java.util.Scanner;
public class TestRectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("... Here are the 5 Objects of Rectangle ...\n");
		
		//Object 1 initializes length and breadth as 0 ..
		System.out.println("Object 1");
		Rectangle r1 = new Rectangle();
		r1.area();
		r1.diplay();
		
		//object 2 initializes length and breath while creation of the object .. 
		Rectangle r2 = new Rectangle(1.1f, 2.2f);
		System.out.println("\nObject 2");
		r2.area();
		r2.diplay();

		//object 3 initializes length and breath according to user input ..
		System.out.println("\nObject 3");
		System.out.println("Please Enter Length and Breadth of rectangle : ");
		Rectangle r3 = new Rectangle(sc.nextFloat(), sc.nextFloat());
		r3.area();
		r3.diplay();
		
		//Object 4 Only Gives value to Length variable. use default value for breadth variable..
		System.out.println("\nObject 4");
		Rectangle r4 = new Rectangle();
		r4.setLength(1.4f);
		r4.area();
		r4.diplay();

		//Object 5 Only Gives value to breadth variable according to user input,
		//use default value for Length variable..
		System.out.println("\nObject 5");
		Rectangle r5 = new Rectangle();
		System.out.println("Please Enter Breadth of rectangle : ");
		r5.setBreadth(sc.nextFloat());
		r5.area();
		r5.diplay();
		
		System.out.println("\n\n.. Thank you! ..\n");
		
	}

}
