
public class Triangle extends Shape {

	private float area;
	private float b, h;
	
	public Triangle() {
		super();
	}

	public Triangle(float b, float h) {
		super();
		this.b = b;
		this.h = h;
	}
	
	public void findArea() {
		
		area = 0.5f*b*h;
		System.out.println("area of Triangle is : "+area);
	}
	
	
}
