
public class InitializerBlockDemo {

	//initializer block..executes only when object is created and called before constructor.
	{
		System.out.println("First Initializer block");
	}
	
	public InitializerBlockDemo() {
		System.out.println("Constructor called..");
	}
	
	//order doesn't matter.. init block always executes before constructor
	{
		System.out.println("2nd Initializer block");
	}
	
	public static void main(String[] args) {
	
		new InitializerBlockDemo();
	}

}
//note : The Instance Initialization Block is invoked after the parent class constructor is invoked (i.e. after super() constructor call)
