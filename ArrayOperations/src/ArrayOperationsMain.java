
import java.util.Scanner;
public class ArrayOperationsMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		ArrayOperations ao = new ArrayOperations();
		
		int arr[] = new int[20];
		int n = 0,ele,pos;
		
		String chh;
		do
		{
			System.out.println("\n1 : Create an Array\n2 : Display Array\n3 : Insert Element into Array\n4 : Delete Element from Array\n5 : Search an Element in an Array\n6 : Sort an Array\n7 : Print Reverse of Array"); 
			System.out.println("Enter Your choice : ");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				   System.out.println("How many Elements do you want to enter in array ?");
				   n = sc.nextInt();
				   ao.create(arr, n);
				   
				break;
			case 2:
					ao.display(arr, n);
				break;
			case 3:
					System.out.println("Enter Element and position to enter in array : ");
					ele = sc.nextInt();
					pos = sc.nextInt();
					n = ao.insert(arr,n,ele,pos);
				break;
				
			case 4:
					System.out.println("Enter Element to delete from array : ");
					ele = sc.nextInt();
					n = ao.deleten(arr,n,ele);
				break;
				
			case 5:
					System.out.println("Enter the element to search in array : ");
					ele = sc.nextInt();
					ao.search(arr,n, ele);
			   break;
			
			case 6:
					System.out.println("1 : Ascending Order\n2 : Descending Order\nEneter the Order : ");
					ao.sort(arr, n, sc.nextInt());
				break;
				
			case 7:
					ao.reverse(arr, n);
				break;
			default:System.out.println("\nInvalid choice!! Please try again..");
			
			}
			
			System.out.println("\nDo you want to continue (Y/N) : ");
			chh = sc.next();
			
		}while((chh.equals("y")) || (chh.equals("Y")));
		
		
		System.out.println("Thank you !! Visit again !!");

	}

}
