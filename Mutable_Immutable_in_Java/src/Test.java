
public class Test {

	public static void main(String[] args) {

		//state (attributes) of the object can be changed once created
		MutableDemo mutable = new MutableDemo();
		System.out.println("----------------------------- Before --------------------------");
		mutable.display();
		mutable.setN1(500);
		mutable.getAddr().setCity("Indore");
		System.out.println("----------------------------- After --------------------------");
		mutable.display();
		
		System.out.println("====================================================================");
		ImmutableDemo immutable1 = new ImmutableDemo();
		ImmutableDemo immutable2 = new ImmutableDemo(100, 200 , new Address("Nashik", "mh"));
		System.out.println("----------------------------- Before --------------------------");
		immutable2.display();
		immutable2.getAddr().setCity("Pune");
		System.out.println("----------------------------- After --------------------------");
		immutable2.display();
	}

}

//all mutable and Immutable class objects are stored in heap

//Why do we need Immutable objects
//they are simple and secure
//provide convenience while working with multiple treads
