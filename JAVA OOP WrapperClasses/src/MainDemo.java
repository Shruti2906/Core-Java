
//Wrapper Classes
public class MainDemo {

	public static void main(String[] args) {

		//Boxing - converting primitive type to object(of wrapper class)
		int a = 10;
		Integer iobj = new Integer(a);
		
		//Unboxing - Converting object(of wrapper class) to primitive type
		 int b;
		 b = iobj.intValue();
		 
		 //Java 5 onwards
		 //Autoboxing
		 String s = "10";
		 int x = Integer.parseInt(s);
		 
		 //autounboxing
		 String y = Integer.toString(x);
		 
		 System.out.println("Integer.toBinary(10) : "+Integer.toBinaryString(4));
		 
	}

}

//There are 2 uses of Wrapper Classes
//1) it can be used to convert primitive types to wrapper class object and vice-versa.
//2) it provides inbuilt methods.

//converting primitive types to objects is necessary as some data structures can work only on objects. 