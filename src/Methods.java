import java.util.Arrays;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods m = new Methods();
		m.hello();
		Methods.greet();
		
		int arr[] = {1,2,3};
		m.print(arr);
		m.fullName("lakshmi","nara");
		m.add(10,20);
		m.division();

	}

	void hello() { // also no parameters and no return type method
		//System.out.println("helloo every one");// instance method invoke by using object creation
	}

	static void greet() {
		//System.out.println("good morning");// static method invoke by className
	}
	
	
	
	void  fullName(String fname,String lname) {//no return type and with parameters
		String name = fname+lname;
		System.out.println(name);
	}
	void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	int add(int a, int b) {//with return type and parameters method
		return a+b;
	}
	
	int division() {//with return type and without parameters
		int a = 10;
		int b = 5;
		System.out.println(a/b);
		return a/b;
	}
		
		
	
	}
	
	

