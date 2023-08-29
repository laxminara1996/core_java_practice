
public class Calculator {
	int add(int a,int b) {
		return a+b;
	}
	int add(int a, int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
	int v1=	c.add(2, 4);
		int v2=c.add(4, 5,6);
		System.out.println(v1);
		System.out.println(v2);
	}

}
//here above example is method overloading why because we are having two same methods but different parameters with same operation.


//which method is execute first the decision taking at compile time only.
//Polymorphism at compile time 