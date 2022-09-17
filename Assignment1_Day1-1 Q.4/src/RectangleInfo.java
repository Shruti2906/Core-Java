
import java.util.Scanner;
public class RectangleInfo {

	Scanner sc = new Scanner(System.in);
	
	public Rectangle[] create() {
		
		Rectangle rec[] = new Rectangle[5];
		
		for(int i=0; i<5; i++) {
			Rectangle r = new Rectangle();
			System.out.println("Enter Rectangle Length : ");
			r.setLength(sc.nextDouble());
			System.out.println("Enter Rectangle Breadth : ");
			r.setBreadth(sc.nextDouble());
			rec[i] = r;
		}
		return rec;
		
	}
	public void display(Rectangle[] r) {
		for(int i=0; i<5; i++) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("Rectangle Length : "+r[i].getLength());
			System.out.println("Rectangle Breadth : "+r[i].getBreadth());
			System.out.println("Perimeter of Rectangle : "+r[i].calculatePerimeter());
			System.out.println("Area of Rectangle : "+r[i].calculateArea());
		}
		System.out.println("-------------------------------------------------------------");
	}
}
