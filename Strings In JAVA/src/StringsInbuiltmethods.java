
public class StringsInbuiltmethods {

	public static void main(java.lang.String[] args) {

		java.lang.String str1 = "abc";
		java.lang.String str2 = "b";

		System.out.println(str1.codePointAt(0)); 
		
		System.out.println(str1.codePointBefore(1));
		
		System.out.println("str1.compareTo(str2) : "+str1.compareTo(str2));//compare string based on sum of ascii values
		
		System.out.println("str1 : "+str1.concat(str2));//concate temporarily
		
		System.out.println("str1 : "+str1);
		
		System.out.println(str1.contains(str2));
		
		System.out.println(str1.contentEquals("gb"));
		
		System.out.println(str1.getBytes());
		
		System.out.println(java.lang.String.valueOf("a"));
		
	}

}
