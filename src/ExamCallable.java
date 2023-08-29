import java.util.concurrent.*;
import java.io.*;
public class ExamCallable implements Callable {
	public Object call() throws Exception {
		System.out.println("call ( ) - method executed...");
		return "success";
	}
public static void main(String[] args) throws Exception{
	ExamCallable ec = new ExamCallable();
	ExecutorService es = Executors.newFixedThreadPool(10);
	for (int i = 1; i <= 15; i++) {
		Future submit = es.submit(ec);
		System.out.println(submit.get().toString());
	}
	es.shutdown();
}
}
