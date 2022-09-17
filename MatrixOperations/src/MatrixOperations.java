
import java.util.Scanner;
public class MatrixOperations {

	public int[][] create()
	{
		Scanner sc = new Scanner(System.in);
		int mat[][];
		int r;
		System.out.println("Enter no of rows for Matrix : ");
		r = sc.nextInt(); 
		mat = new int[r][];
		
		System.out.println("Enter no of columns for each row : ");
		for(int i=0; i<mat.length; i++)
		{
			mat[i] = new int[sc.nextInt()];
		}
		
		
		return mat;
	}
	
	public void insert(int[][] mat)
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[i].length; j++) {
				
				mat[i][j] = sc.nextInt();
			}
		}
		
	}
	
	public void display(int[][] mat)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Elements in the Matrix are : ");
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[i].length; j++) {
				
				System.out.print("\t"+mat[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public boolean validate(int[][] mat1, int[][] mat2)
	{
		
		boolean b = false;		
		
		if(mat1.length == mat2.length)
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
		
		return b;
		
	}
	
	public void addition(int[][] mat1, int[][] mat2)
	{
		int mat3[][] = new int[mat1.length][];
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
}
