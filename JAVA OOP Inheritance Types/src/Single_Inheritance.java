class Base{
	
	public Base() {
		System.out.println("Demo class Constructor..");
	}
}

class Derived extends Base{
	
	public Derived() {
		System.out.println("Derieved class Constructor..");
	}
}

public class Single_Inheritance {

	public static void main(String[] args) {
		
			Derived d = new Derived();

	}

}
