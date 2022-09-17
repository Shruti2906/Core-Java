
import java.util.Scanner;

public class MatrixOperations {
		Scanner sc = new Scanner(System.in);

		//Method to create Matrix..
		public int[][] createMatrix(){
			System.out.println("How many rows you want in matrix : ");
			int r=sc.nextInt();
			int mat[][] = new int[r][];
			
			for(int i=0; i<mat.length; i++) {
				System.out.println("Enter column length for row "+(i+1));
				int col = sc.nextInt();
				mat[i] = new int[col];
			}
			
			for(int i=0; i<mat.length; i++) {
				System.out.println("Enter Elements for row "+(i+1)+" : ");
				for(int j=0; j<mat[i].length; j++) {
					int ele = sc.nextInt();
					mat[i][j] = ele;
				}
			}
			
			return mat;
		}
		
		//Method to Display Matrix..
		public void display(int[][] mat) {
			for(int i=0; i<mat.length; i++) {
				for(int j=0; j<mat[i].length; j++) {
					System.out.print(" "+mat[i][j]);
				}
				System.out.println();
			}
		}
		
		//Method to Validate row and col for addition
		public boolean validate(int[][] mat1, int[][] mat2) {
			boolean b = true;
			if(mat1.length == mat2.length) {
				for(int i=0; i<mat1.length; i++) {
					if(mat1[i].length != mat2[i].length) {
						b = false;
						break;
					}
				}
			}
			else {
				b = false;
			}
			return b;
			
		}
		
	
		//Method for Addition
		public int[][] addition(int[][] mat1, int[][] mat2) {
			
			//Allocation for matrix addition
			int matAdd[][] = null;
			matAdd = new int[mat1.length][];
			
			for(int i=0; i<mat1.length; i++) {
				matAdd[i] = new int[mat1[i].length];
			}
			
			//addition
			for(int i=0; i<matAdd.length; i++) {
				for(int j=0; j<matAdd[i].length; j++) {
					matAdd[i][j] = mat1[i][j]+mat2[i][j];
				}
			}
			return matAdd;
			
		}
		
		//Multiplication
		public int[][] multiplication(int[][] mat1, int[][] mat2) {
			
			int mat[][] = null;

			//allocate matrix 
			mat = new int[mat1.length][];
			for(int i=0; i<mat1.length; i++) {
				mat[i] = new int[mat1[i].length];
			}
			for(int i=0; i<mat1.length; i++) {
				for(int j=0; j<mat1[i].length; j++) {
					mat[i][j] = 0;
				}
			}
			
			for(int i=0; i<mat1.length; i++) {
				for(int j=0; j<mat1[i].length; j++) {
					mat[i][j] = mat[i][j]+(mat1[i][j]*mat2[i][j]);
				}
			}
			return mat;
			
		}
}
