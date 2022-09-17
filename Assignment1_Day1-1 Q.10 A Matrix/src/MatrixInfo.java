
public class MatrixInfo {

	
	public void display(Matrix matrix) {
		int m[][] = matrix.getMatrix();
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				System.out.print(" "+m[i][j]);
			}
			System.out.println();
		}
		
	}
	
}
