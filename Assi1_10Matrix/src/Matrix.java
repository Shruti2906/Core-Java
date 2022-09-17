
public class Matrix {
	
	private int[][] arr = new int[10][10];
	private int rows = 10;
	private int columns = 10;
	
	public Matrix() {
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				arr[i][j] = 0;
			}
		}
	}
	
	public Matrix(int rows, int columns) {
		
		new Matrix();
		this.rows = rows;
		this.columns = columns;
		
	}

	public void setElement(int r, int c, int value) {
		
		if(r>=0 && r<=10 && c>=0 && c<=10 && value>0) {
			
			arr[r-1][c-1] = value;
		}
		else
			System.out.println();
		
	}
	
	public int[][] Matrixtranspose() {
		
		int[][] transposeMatrix = new int[10][10];
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				transposeMatrix[i][j] = arr[j][i];
			}
		}
		return transposeMatrix;
		
	}
	
	public void displayMatrix(Matrix m) {
		
		System.out.println("------------------ Matrix[rows][columns] ---------------");
		int mat[][] = m.arr;
		for(int i=0; i<rows; i++) {
			
			for(int j=0; j<columns; j++) {
				System.out.print("\t"+mat[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("\n\n------------------- Transpose Matrix ----------------------");
		
		int tmat[][] = m.Matrixtranspose();
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print("\t"+tmat[i][j]);
			}
			System.out.println("");
		}
			
	}
}
