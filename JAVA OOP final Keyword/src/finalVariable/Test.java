package finalVariable;

//there are 3 uses of final keyword
//1 final variable
//2. final method
//3. final classes

public class Test {
	
	final int n1 = 10;	//1 way of initializing final variable
	final int n2;			//blank final variables
	static final int n3;	//blank final variables
	final int n4;			//blank final variables
	int n6;
	
	{
		n2 = 20;	//1 way of initializing blank final variable
	}
	
	static {		//2nd way of initializing blank final variable
		n3 = 30;
	}
	
	public Test() {
		n4 = 40;
	}
	
	public static void main(String[] args) {
		
		final int n5;	//local final variable
		n5 = 50;
		
		//reference final variable
		final Test t1 = new Test();
		Test t2 = new Test();
		
		//t1 = t2;	//invalid t1 cannot be re-bound with another object
		
		t1.n6 =60;	//however the state of the object where t1 is refering can be changed
		
		System.out.println(60);

	}

}
