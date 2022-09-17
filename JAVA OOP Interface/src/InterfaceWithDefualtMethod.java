
public interface InterfaceWithDefualtMethod {

//even if default keyword is used access modifier is "public" for all methods in interface 	
	default void fun() {
		
		System.out.println("default method of inteface");
	}
}
