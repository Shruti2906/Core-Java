
class Base1{
	
	public Base1() {
		System.out.println("Base Constructor..");
	}
}

class Derived1 extends Base1{
	
	public Derived1() {
		System.out.println("Derived1 Constructor..");
	}
}

class Derived2 extends Base1{
	
	public Derived2() {
		System.out.println("Derived2 Constructor..");
	}
}

public class HeirarchicaIinheritance {

	public static void main(String[] args) {
		
		Derived1 d1 = new Derived1();
		Derived2 d2 = new Derived2();

	}

}
