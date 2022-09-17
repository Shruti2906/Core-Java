
public class Test {

	public static void main(String[] args) {
	
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		String operation = args[2];
		
		if(operation.equals("+")) {
			
			System.out.println("Addition of "+n1+" and "+n2+" is : "+(n1+n2));
		}
		else if(operation.equals("-")) {
			
			System.out.println("Substraction of "+n1+" and "+n2+" is : "+(n1-n2));
		}
		else if(operation.equals("'*'")) {
			
			System.out.println("Multiplication of "+n1+" and "+n2+" is : "+(n1*n2));
		}
		else if(operation.equals("/")) {
			
			System.out.println("Division of "+n1+" and "+n2+" is : "+(n1/n2));
		}
		else {
			System.out.println("No Proper Operation is mentioned ...");
		}
		
	}

}
