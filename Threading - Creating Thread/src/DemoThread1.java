
//Way 1 to create Thread in java
//By extending Thread class

public class DemoThread1 extends Thread{

	public DemoThread1() {
		//System.out.println("Demo Thread 1 Running..");
	}
	
	@Override
	public void run() {
		
		super.run();
		for(int i=1; i<=5; i++) {
			
			System.out.println(i+" demo thread 1 running..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
			
		
	}
	
	public void run(int n) {
		System.out.println("demo thread 1 n.. run called ");
	}
}
