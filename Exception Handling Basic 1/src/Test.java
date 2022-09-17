

public class Test {

	public static void main(String[] args) {
		
		int n1, n2;
		int result = 0;
		
		try {
			
			n1 = Integer.parseInt(args[0]);
			n2 = Integer.parseInt(args[1]);
			result = n1/n2;
			
		}
	//Way 1
		catch(ArithmeticException e) {
			
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
		}
	/*//Way 2
		  catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Arithmetic Exception "+e);
		}*/
		
	/*//Way 3
	 * catch(Exception e) {
			System.out.println("Some Exception..");
		}*/
		
		System.out.println("Thank You..");
	}

}
