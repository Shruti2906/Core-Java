
public class Circle implements Shape {

	float pi = 3.14f;
	float area, r;
	
	public Circle(float r) {
		this.r = r;
	}
	
	@Override
	public void findArea() {
		
		area = pi*r*r;
		System.out.println("Circle area : "+area);
		
	}

	
}
