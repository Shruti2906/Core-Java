
class Parent{
	protected void fun() {
		System.out.println("parent");
	}
}

class Son extends Parent{
	public void fun() {			//visibility increased protected to public
		System.out.println("son");
	}
}

class GrandSon extends Son{
	public void fun() {
		System.out.println("grand son");
	}
}

public class Test_Multilevel_Overriding {

	public static void main(String[] args) {
		Parent p = new GrandSon();
		p.fun();
		
	}

}
