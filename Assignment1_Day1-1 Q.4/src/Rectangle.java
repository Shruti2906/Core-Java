
public class Rectangle {

	private double length;
	private double breadth;
	
	public Rectangle() {
		length = 1;
		breadth = 1;
	}
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public double calculatePerimeter() {
	
		return 2*(length+breadth);
	}
	public double calculateArea() {
		
		return length*breadth;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if((length > 0.0) && (length < 20.0)) {
			this.length = length;
		}
		else {
			System.out.println("Invalid Input for Length.!!");
		}
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		if((breadth > 0.0) && (breadth < 20.0)) {
			this.breadth = breadth;
		}
		else {
			System.out.println("Invalid Input for breadth.!!");
		}
	}
}
