
public class Rectangle {

	private float length;
	private float breadth;
	private double area;
	
	public Rectangle() {
		
	}

	public Rectangle(float length, float breadth) {
	
		this.length = length;
		this.breadth = breadth;
	}

	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getBreadth() {
		return breadth;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	public void area()
	{
			area = length*breadth;
	}
	public void diplay()
	{
		System.out.println("Length of Rectangle is : "+length);
		System.out.println("Breadth of Rectangle is : "+breadth);
		System.out.println("Area of Rectangle is : "+area);
	}
	
	
	
	
	
}
