
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			Compartment com[] = new Compartment[10]; 
			for(int i=0; i<com.length; i++) {
				System.out.println("\n1]FirstClass\t2]Ladies\t3]General\t4]Luggage");
				System.out.println("Enter any digit between 1 to 4 ");
				int ch = sc.nextInt(); 
				if(ch == 1) {
					com[i] = new FirstClass();
					com[i].notice();
				}
				else if(ch == 2) {
					com[i] = new Ladies();
					com[i].notice();
				}
				else if(ch == 3) {
					com[i] = new General();
					com[i].notice();
				}
				else if(ch == 4) {
					com[i] = new Luggage();
					com[i].notice();
				}
				else {
					System.out.println("invalid choice..");
					com[i] = new FirstClass();
					com[i].notice();
				}
			}
			
			System.out.println("Thak You .!");
			
			/*for(int i=0; i<com.length; i++) {
				com[i].notice();
			}*/
	}

}
