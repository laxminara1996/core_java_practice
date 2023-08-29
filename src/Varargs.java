import java.io.*;
public class Varargs implements Cloneable{

	public void add(int... a) {
		int sum = 0;
		for (int x : a) {
			sum = sum + x;
		}
		System.out.println(sum);
		Integer sum1 = new Integer(sum);
		System.out.println("boxing"+sum1);//boxing coverted to object type
	}
	
	public static void main(String[] args) throws Exception {
		Varargs var = new Varargs();
		Object obj = var;
		System.out.println(obj);
		Object object = var.clone();
		Varargs var1 = (Varargs) object;
		System.out.println(var1);
		var.add(10);
		var.add(10,20);
		var.add(10,20,30);
	}
}
