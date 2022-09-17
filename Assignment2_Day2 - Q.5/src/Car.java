
public class Car {

	private int speed;
	private int noOfGear;
	
	public void drive() {
		speed = 15;
		noOfGear = 2;
	}
	public void display() {
		drive();
		System.out.println("Speed : "+speed);
		System.out.println("noOfGear : "+noOfGear);
	}
}
