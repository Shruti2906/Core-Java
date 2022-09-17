
public class Demo {
	
	private int n1;
	private int n2;

	//init block called before constructor 
	{
		System.out.println("Init Block");
	}
	//Constructor Overloading
	public Demo() {	//do nothing constructor
	
	}

	public int Demo(char c) {//normal method
		
		System.out.println(this+" in int demo()");
		return 0;
	}

	public Demo(int n1) {
		
		this(n1, 1);
		this.n1 = n1;
		System.out.println("n1 : "+n1);
		
	}

	public Demo(int n1, int n2) {
		
		this.n1 = n1;
		this.n2 = n2;
		System.out.println("n1 : "+n1+"\tn2 : "+n2);
		
	}

	public static void main(String[] args) {
	
	//	System.out.println(new Demo());
		Demo d = new Demo();
		Demo d1 = new Demo(10);
		Demo d2 = new Demo(10, 20);
		System.out.println(d1.Demo('c'));
		
	//	Trial t = new Trial();	//error private constructor cannot be called
		Trial t = new Trial(1);
		
	}

}
//constructor cannot be static, abstract, final, synchronized