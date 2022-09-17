
public class SportCar extends Car{

	private int airBallon;
	
	public SportCar() {
		airBallon = 4;
	}
	
	public void display() {
		super.display();
		System.out.println("No Of AirBallons : "+airBallon);
		
	}
}
