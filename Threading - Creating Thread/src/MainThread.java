
//run() method is provided by Thread class of java.lang package

public class MainThread {

	public static void main(String[] args) {
		
		//creating thread ...
		DemoThread1 t1 = new DemoThread1();	
		//creating object for class
		DemoThread2 t22 = new DemoThread2();
	
		//to use start method of thread class we need to convert t22 to 'thread'.
		Thread t2 = new Thread(t22);
		
		
		//making thread runnable
		//Thread scheduler will choose one thread from runnable threads to run.
		t1.start();	
		t2.start();

		
		//when thread start running run() method is called.
		
	}

}
