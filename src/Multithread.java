
public class Multithread extends Thread implements Runnable {
	public void run() {
		System.out.println("run () method started...");

		//Thread t = Thread.currentThread();
		//System.out.println(t.getName());
		try {
			Thread.sleep(5000); // blocked state
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("run () method ended...");
	}
	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();//main thread
		System.out.println(currentThread.getName());
		Multithread mt = new Multithread();//new state
		Thread t = new Thread(mt);//runnable state
		t.start();//call run method internally
		
		
	}

}
