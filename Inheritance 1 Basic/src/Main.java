

class Base1{

	protected int n1;
	
	public Base1() {
		System.out.println("Base 1 default Constructor.!");
	}
	
	public Base1(int n1) {
		this.n1 = n1;
		System.out.println("Base1 Parameteric Cnstructor.!");
	}
	
	public void show() {
		System.out.println("Base1 show..");
	}
}

class Derived1 extends Base1{
	
	private int n1 = 20;
	
	public Derived1() {
		
		super(10);
		System.out.println("Derived 1 Default Constructor.!");
	}
	
	public void show() {
		
		super.show();
		System.out.println("Derived 1 Show..");
		System.out.println("Base1's n1 : "+super.n1);
		System.out.println("Derived's n1 : "+n1);
	}
}

public class Main {

	public static void main(String[] args) {

		System.out.println("in Main..");
		Derived1 d = new Derived1();
		d.show();
	}
}
