
public class Test implements TestInterface{

	public static void main(String[] args) {

		Test t = new Test();
		t.fun1();
		
		TestInterface.fun3();

	}

	@Override
	public void fun1() {
		System.out.println("implemented fun in Test");
		
	}

}
//NOTE :  "scope" of the static method is within interface only
//	it is not inherited in its implementing classes
//	reason is it will again lead to diamond problem
//as one class can implement more than one interface which could have same name static methods

/*
 * NOTE : Static methods can be inherited in classes 
 * 			because a class can extend utmost one class..but it's not the case with interface
 * 			thus interface's static method is NEVER inherited.
 **/