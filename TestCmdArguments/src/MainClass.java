
public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("elements from args : ");
		for(int i=0; i<args.length; i++) {
			System.out.print(" "+args[i]);
		}
		//reverse order
		System.out.println("\nin reverse Order");
		for(int i=args.length-1; i>=0; i--) {
			System.out.print(" "+args[i]);
		}
		
		//sum of all elements
		int sum=0;
		for(int i=0; i<args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("\nsum of all elements is : "+sum);
		
		//print even odd and their sum
		int evenCnt=0, oddCnt=0,evenSum=0, oddSum=0; 
		for(int i=0; i<args.length; i++) {
			if(Integer.parseInt(args[i]) != 0) {
				if((Integer.parseInt(args[i])) %2 == 0) {
					
					evenCnt++;
					evenSum +=Integer.parseInt(args[i]);
				}
				else {
					
					oddCnt++;
					oddSum += Integer.parseInt(args[i]);
				}
			}
		}
		System.out.println("Even Count : "+evenCnt);
		System.out.println("Even Sum : "+evenSum);
		
		System.out.println("Odd Count : "+oddCnt);
		System.out.println("Odd Sum : "+oddSum);
		

	}

}
//cmd args
