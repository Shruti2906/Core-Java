
import java.util.*;
public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//int ar = new int{1, 2, 3};
		int arr[] = new int[5];
		int key;
		
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array Elements are : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(" "+arr[i]);
		}
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				System.out.println("even");
			}
			else {
				System.out.println("Odd");
			}
		}
		
		System.out.println("\nEnter element to Search in Array : ");
		key = sc.nextInt();
		
		boolean b = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				
				System.out.println("Element present at position "+(i+1)+"");
				b=true;
				break;
			}
		}
		if(!b) {
			System.out.println("Element not Found.!");
		}

		//print element at given index
		int pos1;
		b=true;
		System.out.println("Enter Position To Print element : ");
		pos1 = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			if((pos1-1) == i) {
				System.out.println("Element at position "+(i+1)+" is : "+arr[i]);
				b=false;
				break;
			}
			
		}
		if(b) {
			System.out.println("Invalid Index Entered");
		}

	}

}
