
public class Trial {
	
	private Trial() {
		System.out.println("In private constructor.!");
	}

	public Trial(int n) {
		this();
		System.out.println("In trial");
	}

}
