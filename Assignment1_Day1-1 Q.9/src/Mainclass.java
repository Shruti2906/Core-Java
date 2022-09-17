
public class Mainclass {

	public static void main(String[] args) {
	
		int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		int sum = 0;
		int smallest = A[0];
		
		for(int i=0; i<15; i++) {
			sum += A[i];
			if(A[i] < smallest) {
				smallest = A[i];
			}
		}
		
		A[15] = sum;
		int avg = sum/15;
		A[16] = avg;
		A[17] = smallest;
		
		System.out.println("Array After Performing given Operations is : ");
		for(int i=0; i<A.length; i++) {
			System.out.print(" "+A[i]);
		}
			
	}

}
