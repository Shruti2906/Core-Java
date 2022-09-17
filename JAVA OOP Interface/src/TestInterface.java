
public interface TestInterface {

	int n1 = 0;		//by default public, static, final
	
	void fun1();	//by default public abstract
	
	//final void fun2();	//interface cannot have final methods
	

	//as static methods canNOT be overridden
	//they should have body
	static void fun3() {
		System.out.println("Test interface static fun3");
	}
	
	
	
	
}
