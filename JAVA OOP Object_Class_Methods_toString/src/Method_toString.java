
public class Method_toString {

	private int id = 1;
	private String name = "abc";
	
	public static void main(String[] args) {

		Method_toString dm = new Method_toString();
		
		//without toString() it will print : DemoMain@762efe5d
		System.out.println("dm : "+dm);
		System.out.println("dm.toString() : "+dm.toString());
		//If we try to print the reference of object :
		// by default toString returns className @ unsigned hexadecimal representation of hash code of object
		System.out.println();
		
	}

	public String toString() {
		return id+" "+name;
	}
}

//toString belongs to object class thus it is available in all classes.
//all wrapper classes and classes in collection framework have implemented toString()