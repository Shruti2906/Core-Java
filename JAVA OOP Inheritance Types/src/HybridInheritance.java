
//combination of more than one type of inheritance

class Super{
	
		public Super() {
			System.out.println("Super Constructor..");
		}
}

class Sub1 extends Super{
	public Sub1() {
		System.out.println("Sub1 Constructor..");
	}
}

class Sub2 extends Super{
	public Sub2() {
		System.out.println("Sub2 Constructor..");
	}
}

class Sub3 extends Sub1{
	public Sub3() {
		System.out.println("Sub3 Constructor..");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
	
		Sub3 s3 = new Sub3();
		Sub2 s2 = new Sub2();
	}

}
