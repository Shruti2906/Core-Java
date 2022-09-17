interface InterfaceOne{
	
	default void fun() {
		System.out.println(" Interface one default fun() ");
	}
}

interface InterfaceTwo{
	
	default void fun() {
		System.out.println(" Interface Two default fun() ");
	}
}

public class MultipleInheritance implements InterfaceOne, InterfaceTwo{

	public static void main(String[] args) {

		System.out.println("Java doen not support multiple inheritance ");
		System.out.println("It can be achieved through Interface");
		
		MultipleInheritance m = new MultipleInheritance();
		m.fun();
	}

	@Override
	public void fun() {
		
		InterfaceOne.super.fun();
		InterfaceTwo.super.fun();
	}

}
