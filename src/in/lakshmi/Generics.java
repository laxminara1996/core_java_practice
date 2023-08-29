package in.lakshmi;

public class Generics<T> {
	public void m1(T arg) {
		System.out.println("passing parameters");
		System.out.println(arg);
	}
public static void main(String[] args) {
	Generics g = new Generics();
	g.m1(10);
	g.m1("hi");
	
}
}
