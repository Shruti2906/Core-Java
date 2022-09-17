import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
		Rectangle rec[] = new Rectangle[5];
		
		RectangleInfo rOperation = new RectangleInfo();

		//create 5 objects of rectangle 
		for(int i=0; i<5; i++) {
			
			System.out.println("Enter Rectangle Length : ");
			float l = sc.nextFloat();
			System.out.println("Enter rectangle Breadth : ");
			float b = sc.nextFloat();
			Rectangle r = new Rectangle(l, b);
			r.setArea(rOperation.calculateArea(r));
			
			rec[i] = r;
			
		}
		
		//display 
		for(int i=0; i<5; i++) {
			System.out.println("-------------------------Rectangle "+(i+1)+"----------------------");
			rOperation.display(rec[i]);
		}
		
	}

}
