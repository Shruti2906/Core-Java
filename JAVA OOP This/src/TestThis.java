
public class TestThis {
	
	public TestThis() {
		System.out.println("default constructor");
		
	}

	public TestThis(int n1) {
		
		this();//call same class constructor 
	}

	public TestThis returnObj() {
		return this;
	}
	
	public static void main(String[] args) {
		
		TestThis t = new TestThis();
		System.out.println("in main : "+t.returnObj());
		
		//return current object
		ReturnThis r = new ReturnThis(10, 20);
		r.getThis().display();
		
		//passing This as an argument 
		PassThisAsArgument p = new PassThisAsArgument(100, 200);
		p.get();
		
	}

}
