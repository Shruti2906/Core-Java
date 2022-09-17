
//static method can be inherited 
//but NEVER be overridden
//writing same name method in sub class will hide the base class method and not override
// even we cannot use super.staticmethod().. as super is reference to base class "object"

class Base{
	
	public static void fun() {
		System.out.println("static fun of base");
	}
}

public class TestInheritance extends Base{

	public static void main(String[] args) {

		fun();	//this hides base class fun and it will call sub class fun
		
		Base b = new Base();
		b.fun();
		
		TestInheritance t = new TestInheritance();
		t.fun();
		
		b = t;
		b.fun();  //it will invoke base class fun as it is not overridden

	}
	
	public static void fun() {	//this hides the base class method but NOT override it

		//super.fun();	//super if reference to base class object & canNOt be applied in static contex
		System.out.println("static fun of sub class");
	}
	
}

/*
 * NOTE : Static methods can be inherited in classes 
 * 			because a class can extend utmost one class..but it's not the case with interface
 * 			thus interface's static method is NEVER inherited.
 **/
