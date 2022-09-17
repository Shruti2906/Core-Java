
public class Circle extends Shape{

	private float area;
	private float r;

	public Circle() {
		super();
	}

	public Circle(float r) {
		super();
		this.r = r;
	}
	
	public void findArea() {
		
		area = 3.14f*r*r;
		System.out.println("area of circle is : "+Math.round(area));
	}
	
}
