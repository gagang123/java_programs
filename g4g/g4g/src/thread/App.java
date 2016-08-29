package thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

	public static void main(String[] args) {
		
		CountDownLatch latch = new CountDownLatch(2);

		ExecutorService executor= Executors.newFixedThreadPool(2);
		
		executor.execute(new Runnable(){
			public void run(){
				System.out.println("task");
				
			}
			
			
		});
		
		
		
	}

}
