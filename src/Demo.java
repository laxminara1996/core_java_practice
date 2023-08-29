import java.io.*;
public class Demo {
	{
		System.out.println("i am from instance block");
	}

	public Demo() {
		System.out.println("I am from constructor");
	}

	static {
		System.out.println("I am from static block");
	}

	
	public String toString(){
		return id + "--" + name;
	}
	int id;
	String name;
	public static void main(String[] args) throws Exception {
		System.out.println("i am from main method...");
		Demo d = new Demo();
		d.id = 101;
		d.name = "John";

		System.out.println(d); // toString ( ) will be called
		System.out.println(d.toString());
		System.out.println(d.hashCode());

		String s1 = new String("hi");
		System.out.println(s1);
		
		Class clz = d.getClass();
		System.out.println(clz.getName());
		System.out.println(d.getClass().getName()); // method chaining to get cls name

		Object object = clz.newInstance(); // 2nd approach to create object for a cls
		System.out.println(object);
	}
}
