
//Way 2 to create Thread in java
//By Implementing Runnable Interface


//It is must to define run() method if we implement runnable.

public class DemoThread2 implements Runnable{

	public DemoThread2() {
		System.out.println("Demo Thread 2 Running..");
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			
			System.out.println(i+" demo thread 2 running..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
