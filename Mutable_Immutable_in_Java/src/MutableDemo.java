
public class MutableDemo {

	private int n1;
	int n2;
	private Address addr;
	
	public MutableDemo() {
		
		this.n1 = 10;
		this.n2 = 20;
		addr = new Address("pune", "mh");
	}
	public MutableDemo(int n1, int n2, Address addr) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.addr = addr;
	}
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	public void display() {
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		System.out.println("city : "+addr.getCity());
		System.out.println("city : "+addr.getState());
	}
	
}
