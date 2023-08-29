
public class Daemon implements Runnable{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("is daemon");
		}else {
			System.out.println("is normal");
		}
		printnums();
	}
	public synchronized void  printnums() {
		for(int i=0 ;i<=5;i++) {
			System.out.println("Thread is "+Thread.currentThread().getName()+"=="+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Daemon d = new Daemon();
		Thread t1 = new Thread(d);
		//t1.setDaemon(true);
		t1.setName("Thread-1");
		t1.start();
		Thread t2 = new Thread(d);
		t2.setName("Thread-2");
		t2.start();
	}
}
