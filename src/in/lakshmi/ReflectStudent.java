package in.lakshmi;

public class ReflectStudent {
	private int age;
	private String name;
	
	public int getAge() {
		System.out.println("enterd after invoke");
		return age;
	}
	/*public void setAge(int age) {
		this.age = age;
	}*/
	void display(){
		System.out.println("hi");
	}
	public void m1() {
		System.out.println("this is m1()");
	}
	public void m2() {
		System.out.println("this is m2()");
	}

}
