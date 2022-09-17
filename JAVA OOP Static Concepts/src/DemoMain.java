//below program demonstrate why main method is static 
//main is called directly by JVM without creating object of it class 
//thus it can access only static members, object is yet not created thus memory is not 
//allocated for n2

import static java.lang.Math.*;
import static java.lang.System.*;

public class DemoMain {

//	static variables
	static int n1;
	static int n2;
	int n3;
	//init block it is called only when constructor is called
	{
		System.out.println("init block");
	}
	
	//static block is called only once..and before constructor and even before main method
	//It is used to initialize the static members
	static 
	{
		n2 = 20;
		System.out.println("static block");
	}
	
	public DemoMain() {
		
		System.out.println("Constructor called..");
	}
	
	public void display1() {
	
			System.out.println("non static Display called");
	}

//	static methods
	public static void display2() {
		
		System.out.println("Static Display called");
	}

	public static void main(String[] args) {
	
			System.out.println("n : "+n1);
		//	System.out.println("n : "+n3);
			display2();
			new DemoMain().display1();
			
			out.println("\nStatic import example");
			out.println("\n"+sqrt(4));
			
			//DemoMain d = new DemoMain();
			//d.display2(); //static method can be called with class name and object name.
			
	}

}
