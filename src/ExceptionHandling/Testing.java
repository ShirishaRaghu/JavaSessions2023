package ExceptionHandling;

public class Testing {

	public static void threadSleep(int time) {
		try {
		Thread.sleep(time);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		
		threadSleep(3000);
		threadSleep(40000);
	}

}
