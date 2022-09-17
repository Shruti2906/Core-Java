
import java.util.Scanner;

public class ArrayOperations {
	
	public void create(int[] arr, int n)
	{
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter Elements in Array : ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Created !!");
	}
	
	public void display(int[] arr,int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.println("\t"+arr[i]);
		}
	}
	
	public int insert(int[] arr, int n, int ele, int pos)
	{
		
		for(int i=n-1; i>=pos-1; i--)
		{
			arr[i+1] = arr[i];
		}
		arr[pos-1] = ele;
		n++;
		System.out.println("Element inserted successfully!!");
		return n;
	}
	
	public int deleten(int[] arr, int n, int ele)
	{
		boolean b = false;
		for(int i=0; i<n; i++)
		{
			if(arr[i] == ele)
			{
				for(int j=i; j<n-1; j++)
				{
					arr[j] = arr[j+1];
				}
				b = true;
				n--;
				break;
			}
		}
		if(b)
			System.out.println("Element deleted successfully!!");
		else
			System.out.println("Element not found!!");
		
		
		return n;
	}
	
	public void search(int[] arr, int n, int ele)
	{
		boolean b = false;
		for(int i=0;i<n; i++)
		{
			if(arr[i] == ele)
			{
				System.out.println("Element found in array at "+(i+1)+"th position");
				//break;
				b = true;
			}
		}
		if(!b)
			System.out.println("Element not found !!");
	}
	
	public void sort(int[] arr,int n, int order)
	{
		int temp;
		if(order == 1)
		{
			for(int i=0; i<n-1; i++)
			{
				for(int j=i+1; j<n; j++)
				{
					if(arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println("Sorted Array in ascending order is : ");
			for(int i=0;i<n; i++)
			{
				System.out.println("\t"+arr[i]);
			}
		}
		else if(order == 2)
		{
			for(int i=0; i<n-1; i++)
			{
				for(int j=i+1; j<n; j++)
				{
					if(arr[i] < arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println("Sorted Array in descending order is : ");
			for(int i=0;i<n; i++)
			{
				System.out.println("\t"+arr[i]);
			}
			
		}
		else
				System.out.println("Invalid Option !!");
	}
	
	public void reverse(int[] arr, int n)
	{
		System.out.println("Reverse of array is : ");
		for(int i=n-1; i>=0; i--)
		{
			System.out.println("\t"+arr[i]);
		}
	}
}
