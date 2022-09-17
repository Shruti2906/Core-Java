
class Demo{
	
	public Demo() {
		System.out.println("object created..");
	}
	@Override
	protected void finalize(){
		System.out.println("finalize called all database, network connections are closed...");
		System.out.println("Safe to remove object now..");
	}
	
}

public class Method_finalize {

	public static void main(String[] args) {
		Demo d = new Demo();
		d = null;
		//d.finalize();
		new Demo();
		System.gc();//gc() method is used to invoke garbage collector 
		System.out.println("Thank you");
		
	}

}
