
//to create class immutable 4 things are required
//1.final class : create class as final so that it cannot be inherited (through subclass variables can be modified after initialization)

//2.all fields should be private and final : so that direct access to field is not possible
		//it is ok even if the field is not private just make sure that direct access is not possible
		//so that it cannot be modified once initialized.

//3. not setters only getters

//4. All mutable fields should be as final so that they can not be iterated once initialized.
	//to do so always pass 'clone/defensive' copy of such(mutable fields) through getters

public class ImmutableDemo {

	//It's fine if variables are not final just make sure they not accessed once initialized
	//i.e initialize it once and block all other access
	
	//But variables have to be private otherwise they will be accessible through object
	
	private int n1;
	private final int n2;
	private Address addr;
	
	public ImmutableDemo() {
		super();
		n1 = 10;
		n2 = 20;
		addr = new Address("pune", "mh");
	}
	
	public ImmutableDemo(int n1, int n2, Address addr) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.addr = addr;
	}

	public int getN1(int n1) {
		return n1;
	}

	public int setN2(int n2) {
		return n2;
	}
//return clone/defensive copy of mutable field
	public Address getAddr() {
		Address addr = new Address();
		addr.setCity(this.addr.getCity());
		addr.setState(this.addr.getState());
		return addr;
	}
	
	public void display() {
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		System.out.println("city : "+addr.getCity());
		System.out.println("city : "+addr.getState());
	}
	
}
