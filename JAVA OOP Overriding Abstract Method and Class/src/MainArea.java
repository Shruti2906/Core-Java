
public class MainArea {

	public static void main(String[] args) {
	
		/*Circle c = new Circle(1.2f);
		c.findArea();
		
		Triangle t = new Triangle(1.0f, 2.0f);
		t.findArea();
		*/
		
		
		Shape sCircle = new Circle(1.1f);
		sCircle.findArea();
				
		Shape sTriangle = new Triangle(1.2f, 2.2f);
		sTriangle.findArea();	
	}

}
