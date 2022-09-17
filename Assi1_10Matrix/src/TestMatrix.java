
public class TestMatrix {

	public static void main(String[] args) {
		
		System.out.println("1st object is here...");
		Matrix m = new Matrix();
		m.displayMatrix(m);
		m.setElement(2, 2, 22);
		m.displayMatrix(m);
		
		
		System.out.println("\n\n2nd object is here...");
		Matrix m1 = new Matrix(5, 5);
		m1.displayMatrix(m1);
		m1.setElement(1, 4, 14);
		m1.displayMatrix(m1);

	}

}
