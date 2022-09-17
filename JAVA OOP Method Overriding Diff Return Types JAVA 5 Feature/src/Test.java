//Program demonstrating method overriding with different return types 
class A{
	
}
class B extends A{
	
}

class Base{
	
	public A fun() {
		System.out.println("Base fun..");
		return new A();
	}
}

class Derived extends Base{
	
	public B fun() {
		System.out.println("Derived fun..");
		return new B();
	}
}

public class Test {

	public static void main(String[] args) {
	
		Derived d = new Derived();
		d.fun();
		Base b = new Base();
		b.fun();
		b = d;
		b.fun();
	}

}
/*
 The overriding method must have same return type (or subtype) : 
 	From Java 5.0 onwards it is possible to have different return type for a overriding method in child class,
 	but child’s return type should be sub-type of parent’s return type. 
 	This phenomena is known as covariant return type. 
 */
