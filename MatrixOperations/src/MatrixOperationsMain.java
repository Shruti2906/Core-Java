
import java.util.Scanner;
public class MatrixOperationsMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MatrixOperations m = new MatrixOperations();
		
		String chh;
		int ch;
		boolean b = false;
		int[][] mat1 = null;
		int[][] mat2 = null;
		
		// Create Memory for Matrix 1
		mat1 = m.create();
		mat2 = m.create();
		
		//Insert Elements into matrices ..
		System.out.println("Enter Elements for Matrix 1 : ");
		m.insert(mat1);
		System.out.println("Enter Elements for Matrix 2 : ");
		m.insert(mat2);
		
		do
		{
			System.out.println("\n1 : Display Matrix\n2 : Validate two matrices for rows & cols\n3 : Perform Matrix Addition\n4 : Exit");
			System.out.println("\nEnter your choice : ");
			ch = sc.nextInt();
			switch(ch)
			{
			
			case 1:
				System.out.println("------------------- Matix 1 ------------------- ");
				m.display(mat1);
				System.out.println("------------------- Matix 2 ------------------- ");
				m.display(mat2);
				break;
				
			case 2 :
				b = m.validate(mat1, mat2);
				if(b)
					System.out.println("Addition is possible");
				else
						System.out.println("Number of rows & cols are not same !!");
				break;
				
			case 3:
				if(b)
					m.addition(mat1, mat2);
				else
					System.out.println("Addition not possible !!");
				break;
				
			case 4 : 
						System.exit(0);
				break;
				
			default : System.out.println("Invalid choice.. Please try later !!");
			}
			System.out.println("Do you want to continue(Y/N) : ");
			chh = sc.next();
		}while((chh.equals("y")) || (chh.equals("Y")));
		
		System.out.println("Thank you !!");
		
	}

}
