import java.util.Random;

public class Test {
	
		public static void main(String[] args) {
		
		Medicine med[] = new Medicine[10];
		
		Random r = new Random();
		for(int i=0; i<med.length; i++) {
			int randomValue = r.nextInt(3);
			if(randomValue == 0) {
				med[i] = new Tablet();
			}
			else if(randomValue == 1) {
				med[i] = new Syrup();
			}
			else {
				med[i] = new Ointment();
				
			}
		}
	
		for(int i=0; i<med.length; i++) {
			med[i].displayLabel();
			System.out.println("\n");
		}
		
		
	}

}
//Estimate dTime : 2.5 hrs
//Required Time 2 hrs
