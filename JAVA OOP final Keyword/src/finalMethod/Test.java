package finalMethod;

//there are 3 uses of final keyword
//1 final variable
//2. final method
//3. final classes

//final method cannot be overridden

class Demo1{
	
	public final void print() {
		
		System.out.println("final print only for Demo1");	
	}
}

class Demo2 extends Demo1{
	
	/*public void print() {	//this is invalid
		
		System.out.println("print for Demo2");	
	}*/
	public void display() {
		print();
		System.out.println("hi");
	}
}

public class Test {

	public static void main(String[] args) {
		
		Demo2 d2 = new Demo2();
		d2.display();
	}

}
