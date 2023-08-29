
public class MultiStart implements Runnable {
	public void run() {
		System.out.println("run () method started..." + Thread.currentThread().getName());
		try {
			Thread.sleep(15000); // blocked state
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("run () method ended..." + Thread.currentThread().getName());
	}

public static void main(String[] args) {
	MultiStart ms = new MultiStart();
	Thread t1 = new Thread(ms);
	t1.setPriority(Thread.MAX_PRIORITY);
	t1.setName("Thread-1");
	t1.start();
	Thread t2 = new Thread(ms);
	t2.setName("Thread-2");
	t2.setPriority(Thread.NORM_PRIORITY);
	t2.start();
	Thread t3 = new Thread(ms);
	t3.setName("Thread-3");
	t3.setPriority(Thread.MIN_PRIORITY);
	t3.start();
}
}
