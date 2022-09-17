
public class PassThisAsArgument {

	private int n1;
	private int n2;
	
	public PassThisAsArgument(int n1, int n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void get() {
		display(this);
	}
	
	public void display(PassThisAsArgument p) {
		System.out.println("\n\nAddition of "+p.n1+" and "+p.n2+" is : "+(p.n1+p.n2));
	}
}
