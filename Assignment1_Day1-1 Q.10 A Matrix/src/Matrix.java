
public class Matrix {

	private int matrix[][] = new int[10][10];
	private int row;
	private int column;
	
	public Matrix() {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = 0;
			}
		}
	}

	public Matrix(int row, int column) {
		this();
		this.row = row;
		this.column = column;
	}
	
	//Set Value at Given Position
	public void setElement(int r, int c, int value) {
		
		
			if((r>0 && r<=row) && (c>0 && c<=column)) {
				if(value>0) {
					matrix[r][c] = value;
				}
				else {
					System.out.println("Invalid value.!");
					matrix[r][c] = value;
				}
			}
			else {
				System.out.println("Invalid row/column.!");
			}
		
	}
	
	//transpose
	public void MatrixTranspose () {
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<i; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}


	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	
}
