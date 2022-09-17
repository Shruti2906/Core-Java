
public class ReturnThis {
	
	private int n1;
	private int n2;
	
	public ReturnThis(int n1, int n2) {
		
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public ReturnThis getThis() {
		return this;
	}

	public void display() {
		System.out.println("\n\nAddition of "+n1+" and "+n2+" is : "+(n1+n2));
	}
}
