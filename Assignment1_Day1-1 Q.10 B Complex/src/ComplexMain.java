
public class ComplexMain {

	public static void main(String[] args) {
		
		int no1 = Integer.parseInt(args[0]);
		int no2 = Integer.parseInt(args[1]);
		Complex n1 = new Complex();
		Complex n2 = new Complex(no1, no2);
		Complex sum = n1.addition(n2);
		Complex sub = n1.subtraction(n2);
		ComplexInfo cInfo = new ComplexInfo();
		
		//Addition display
		System.out.print("\nAddition of  ");
		cInfo.display(n1);
		System.out.print("  And ");
		cInfo.display(n2);
		System.out.print("\tis : ");
		cInfo.display(sum);

		
		//Subtraction display
		System.out.print("\nsubtraction of  ");
		cInfo.display(n1);
		System.out.print("  And ");
		cInfo.display(n2);
		System.out.print("  is : ");
		cInfo.display(sub);
	}

}
