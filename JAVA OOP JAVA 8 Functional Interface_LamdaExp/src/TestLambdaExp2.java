
interface Shape{
	
	void draw();
}

class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("This is Circle");
	}
	
}

class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("This is Rectangle");		
	}
	
}

public class TestLambdaExp2 {

	public static void main(String[] args) {
	
		Shape rec = new Rectangle();
		rec.draw();
		Shape cir = new Circle();
		cir.draw();
		
		//reference of lambda function is stored in s 
		Shape s = ()-> System.out.println("This is Rectangle");
		print(s);
		s = () -> System.out.println("This is Circle");
		print(s);
		
		//.... OR ....
		
		print(()-> System.out.println("This is Rectangle"));//reference of lambda function is passes to print()
		print(()-> System.out.println("This is Circle"));
	}

	public static void print(Shape obj) {
		
		obj.draw();
	}
}