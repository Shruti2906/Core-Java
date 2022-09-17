
public class MatrixMain {

	public static void main(String[] args) {
	
		MatrixInfo mInfo = new MatrixInfo();
		
		//matrix object with default constructor
			Matrix matrix1 = new Matrix();
			System.out.println("\nMatrix 1 : ");
			mInfo.display(matrix1);
			
		//matrix object with parameterized constructor 
			Matrix matrix2 = new Matrix(4,4);
			System.out.println("\nMatrix 2 : ");
			mInfo.display(matrix2);
			
			matrix2.setElement(1, 1, 10);
			System.out.println("\nMatrix 2 after setElement : "); 
			mInfo.display(matrix2);
			
			matrix2.MatrixTranspose();
			System.out.println("\nMatrix 2 after Transpose : "); 
			mInfo.display(matrix2);
			
	}

}
