
public class Demo {

	public void display(int...n) {
		
		for(int i:n) {
			System.out.print("\t"+i);
		}
	}
	
	public void display(float n1, int ...n) {
		
		System.out.println("n1 : "+n1);
		for(int i:n) {
			System.out.print("\t"+i);
		}
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.display(1);
		System.out.println();
		d.display(1,2,3);

	}

}
//Note : (1)
//	overloading of varargs method is possible but could lead to ambiguity.
//e.g
/*
 	public void display(int ...n) {
		
		for(int i:n) {
			System.out.print("\t"+i);
		}
	}
	
	public void display(float n1, int ...n) {
		
		System.out.println("n1 : "+n1);
		for(int i:n) {
			System.out.print("\t"+i);
		}
	}
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.display(1);
		System.out.println();
		d.display(1,2,3);

	}

 (2)
 there should be at most only one varargs parameter in one method
 below code is NOT valid
 public void display(int...n, float...f) {//not valid
		
		for(int i:n) {
			System.out.print("\t"+i);
		}
 }
 
 (3)varargs parameter should be the last parameter in parameter list
 below code is NOT valid
  public void display(int...n, float f, int n) {
		
		for(int i:n) {
			System.out.print("\t"+i);
		}
 }
 */