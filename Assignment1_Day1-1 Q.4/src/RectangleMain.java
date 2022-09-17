
import java.util.Scanner;
public class RectangleMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		RectangleInfo rInfo = new RectangleInfo();
		Rectangle r[] = rInfo.create();
		rInfo.display(r);
	}

}
