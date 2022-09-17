
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int matrix[][] = new int[4][];
		int matrix2[][] = new int[4][];
		int matrixAdd[][] = new int[4][];
		int matMul[][] = new int[4][];
		
		int col, ele;

		System.out.println("*** For Matrix 1 ***");
		for(int i=0; i<4; i++) {
			System.out.println("Enter The no of columns for row "+(i+1));
			col = sc.nextInt();
			matrix[i] = new int[col];
		}
		
		for(int i=0; i<matrix.length; i++) {
			System.out.println("Enter "+matrix[i].length+" Elements for row "+(i+1));
			for(int j=0; j<matrix[i].length; j++) {
				
				ele = sc.nextInt();
				matrix[i][j] = ele;
				
			}
		}
		
		
		System.out.println("*** For Matrix 2 ***");
	
		for(int i=0; i<4; i++) {
			System.out.println("Enter The no of columns for row "+(i+1));
			col = sc.nextInt();
			matrix2[i] = new int[col];
		}
		
		for(int i=0; i<matrix2.length; i++) {
			System.out.println("Enter "+matrix2[i].length+" Elements for row "+(i+1));
			for(int j=0; j<matrix2[i].length; j++) {
				
				ele = sc.nextInt();
				matrix2[i][j] = ele;
				
			}
		}
		
		//checking for no of rows and columns
		boolean b=true;
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				if(matrix[i].length != matrix2[i].length) {
					b = false;
					break;
				}
			}
		}
		if(b) {
		
			//creating matrix for addition
			for(int i=0; i<4; i++) {
				matrixAdd[i] = new int[matrix[i].length];
			}
			
			//Addition
			for(int i=0; i<4; i++) {
				for(int j=0; j<matrix[i].length; j++) {
					matrixAdd[i][j] = matrix[i][j] + matrix2[i][j];
				}
			}
			
			//Print Addition..	
			System.out.println("\n Addition Matrix is : \n");
			
			for(int i=0; i<matrixAdd.length; i++) {
				for(int j=0; j<matrixAdd[i].length; j++) {
					System.out.print(" "+matrixAdd[i][j]);
				}
				System.out.println();
			}

			
		}
		else {
			System.out.println("Addition Not Possible..");
		}
		
		//Multiplication
		//initializing matrixMul with 0
		for(int i=0; i<matMul.length; i++) {
			for(int j=0; j<matMul[i].length; j++) {
				matMul[i][j] = 0;
			}
		}
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				matMul[i][j] = matMul[i][j]+(matrix[i][j]*matrix2[i][j]);
			}
			
		}
		//print Multiplication
		for(int i=0; i<matMul.length; i++) {
			for(int j=0; j<matMul[i].length; j++) {
				System.out.print(" "+matMul[i][j]);
			}
			System.out.println();
		}

		
	}

}



