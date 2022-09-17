
import java.util.Scanner;
public class MatrixTest {

	public static void main(String[] args) {
		
		int mat[][] = {
				{1},
				{1,2},
				{1,2,3},
				{1,2,3,4}
				
		};
		
		System.out.println("Matrix Eements are : ");
		for(int  i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[i].length; j++)
			{
				System.out.print("\t"+mat[i][j]);
			}
			System.out.println();
		}

		//.. Take row's & Column's value dynamically from user ..

		Scanner sc = new Scanner(System.in);
		
		//Accept rows ..
		System.out.println("Enter no of rows in the matrix : ");
		int r = sc.nextInt();
		int mat1[][] = new int[r][];
		
		//Accept Column ..
		System.out.println("Enter no of columns for each row : ");
		for(int i=0; i<mat1.length; i++)
		{
			mat1[i] = new int[sc.nextInt()];
		}
		
		//Accept elements in matrix ..
		System.out.println("Enter the Elements in Matrix : ");
		for(int i=0;i<mat1.length; i++)
		{
			for(int j=0; j<mat1[i].length; j++)
			{
				mat1[i][j] = sc.nextInt();
			}
		}
		
		
		//Print Matrix ..
		System.out.println("Matrix Eements are : ");
		for(int  i=0; i<mat1.length; i++)
		{
			for(int j=0; j<mat1[i].length; j++)
			{
				System.out.print("\t"+mat1[i][j]);
			}
			System.out.println();
		}

		
		
	}

}
