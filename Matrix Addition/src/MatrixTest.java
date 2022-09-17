import java.util.Scanner;

import java.util.Scanner;
public class MatrixTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//.........Matrix1.......
		
		//Accept rows ..
		System.out.println("Enter no of rows for matrix1 : ");
		int r = sc.nextInt();
		int mat1[][] = new int[r][];
		
		//Accept Column ..
		System.out.println("Enter no of columns for each row : ");
		for(int i=0; i<mat1.length; i++)
		{
			mat1[i] = new int[sc.nextInt()];
		}
		
		//Accept elements in matrix ..
		System.out.println("Enter the Elements in Matrix1 : ");
		for(int i=0;i<mat1.length; i++)
		{
			for(int j=0; j<mat1[i].length; j++)
			{
				mat1[i][j] = sc.nextInt();
			}
		}
		
		//.........Matrix2.......
		//Accept rows ..
				System.out.println("Enter no of rows for matrix2  : ");
				int r2 = sc.nextInt();
				int mat2[][] = new int[r2][];
				
				//Accept Column ..
				System.out.println("Enter no of columns for each row : ");
				for(int i=0; i<mat2.length; i++)
				{
					mat2[i] = new int[sc.nextInt()];
				}
				
				//Accept elements in matrix ..
				System.out.println("Enter the Elements in Matrix2 : ");
				for(int i=0;i<mat2.length; i++)
				{
					for(int j=0; j<mat2[i].length; j++)
					{
						mat2[i][j] = sc.nextInt();
					}
				}
		
				
		//Compare no of rows and columns for both matrices
				
		boolean b = false;		
			
		if(r == r2)
		{
			for(int i=0;i<mat1.length;i++)
			{
				if(mat1[i].length != mat2[i].length)
				{
					b = false;
					break;
				}
				else
					b = true;
			}
		}
		
		if(b)
		{
			//..........Create matrix 3......
			
			int mat3[][] = new int[r][];
			for(int i=0; i<mat2.length; i++)
			{
				mat3[i] = new int[mat1[i].length];
			}
	
			for(int i=0; i<mat1.length; i++)
			{
				for(int j=0; j<mat1[i].length; j++)
				{
					mat3[i][j] = mat1[i][j]+mat2[i][j];
				}
			}
			
			System.out.println("Addition of matrix one and two is : ");
			for(int i=0;i<mat3.length; i++)
			{
				for(int j=0; j<mat3[i].length; j++)
				{
					System.out.print("\t"+mat3[i][j]);
				}
				System.out.println();
			}
		}
		else
			System.out.println("Addition not possible !!");
		
		
		
	}

}
