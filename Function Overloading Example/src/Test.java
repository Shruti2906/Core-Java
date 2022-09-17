import java.util.Scanner;

public class Test {

	/*
	public static void greater(int a, int b) {
		if(a>b)
			System.out.println("Greater is : "+a);
		else 
			System.out.println("Greater is : "+b);
	}
	
	public static void greater(float a, float b) {
		if(a>b)
			System.out.println("Greater is : "+a);
		else 
			System.out.println("Greater is : "+b);
	}
	
	public static void greater(char a, char b) {
		if(a>b)
			System.out.println("Greater is : "+a);
		else 
			System.out.println("Greater is : "+b);
	}*/
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.greater(10, 20);
		d.greater(10.10f, 20.20f);
		d.greater('a', 'b');
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char : ");
		

	}

}
