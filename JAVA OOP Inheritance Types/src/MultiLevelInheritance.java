
class GrandFather{
	
	public GrandFather() {
		System.out.println("GrandFather Constructor..");
	}
}

class Father extends GrandFather{
	
	public Father() {
		System.out.println("Father Constructor..");
	}
}

class Son extends Father{
	
	public Son() {
		System.out.println("Son Constructor..");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		Son s = new Son();	

	}

}
