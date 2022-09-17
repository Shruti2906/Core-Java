
public class Test {

	public static void main(String[] args) {

		String s1 = "Shruti";
		String s2 = "Shruti";
		String s3 = new String("Shruti");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);	//Compares Memory
		System.out.println(s1.equals(s3));	//Compares Content
		
		//equals method of object class is overridden by String class that returns true 
		//if content of 2 strings is equal.
			
	}

}
