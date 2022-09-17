public class MatrixApp {
	public static void main(String[] args) {
		MatrixOperations m = new MatrixOperations();
		
		//create matrix
		System.out.println(".. For Matrix 1 ..");
		int mat1[][] = m.createMatrix();
		System.out.println(".. For Matrix 2 ..");
		int mat2[][] = m.createMatrix();
		
		//display matrix
		System.out.println(".. Matrix 1 ..");
		m.display(mat1);
		System.out.println(".. Matrix 2 ..");
		m.display(mat2);
		
		//Addition
		if(m.validate(mat1, mat2)) {
			int mat[][] = m.addition(mat1, mat2);
			System.out.println("Addition : ");
			m.display(mat);
		}
		else {
			System.out.println("Addition not possible.!");
		}
		
		//Multiplication
		if(m.validate(mat1, mat2)) {
			System.out.println("Multiplication : ");
			int mat[][] = m.multiplication(mat1, mat2);
			m.display(mat);
		}
		else {
			System.out.println("Addition not Possible");
		}
	}

}
