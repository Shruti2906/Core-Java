//super is a reference variable that refers to parent class object

class Base{
	
	public int n = 10;
	
	public Base() {
		System.out.println("Base Default Constructor...");
	}
	
	public Base(int n) {
		System.out.println("Base Parametric Constructor...");
		this.n = n;
	}
	
	public void print() {
		System.out.println("Base Print n : "+n);
	}
}

class Derived extends Base{

	private int n = 20;
	
	public Derived() {
		
		//super(); //it will invoke base class default constructor..
		
		super(10);	//super should be the first line in sub class constructor
					//by default super() is there in very constructor 
		System.out.println("Derived Constructor...");
	}
	
	public void print() {
		System.out.println("n : "+n);
		System.out.println("super.n : "+super.n);
		super.print();
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		Derived b = new Derived();
		b.print();
	}
}
