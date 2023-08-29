import java.util.concurrent.*;

public class MyThread {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Thread t1 = new Thread() {
        	public void run() {
        		System.out.println("thread executed way 1");
        	}
        };
		t1.start();
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("thread executed way 2");
			}
		};
		Thread t2 = new Thread(r);
		t2.start();
		Callable c = new Callable() {
			public Object call() throws Exception{
				System.out.println("thread executed way 3");
				return null;
			}
		};
		ExecutorService ex = Executors.newFixedThreadPool(1);
		ex.submit(c);
	}

}
