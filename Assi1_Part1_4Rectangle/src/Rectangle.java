
public class Rectangle {

	private float length;
	private float width;
	private float area;
	private float perimeter;
	
	public Rectangle() {
			
		length = 1;
		width = 1;
		
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		if(length>0.0 && length<2.0)
			this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		if(length>0.0 && length<2.0)
			this.width = width;
	}

	public void area() {
		
		area = length*width;
		
	}
	
	public void perimeter() {
		perimeter = (length+width)*2;
		
	}
	
	public void display() {
		
		System.out.println("\n\n.. Rectangle Description ..\n");
		System.out.println("Length of Rectangle is    : "+length);
		System.out.println("Width of Rectangle is     : "+width);
		System.out.println("Area of Rectangle is      : "+area);;
		System.out.println("Perimeter of Rectangle is : "+perimeter);
		
	}
	
}
