
public class MethodTask1 {
int id;
String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTask1 m = m1(101);// accessing the methods in same class 2 methods are same static method so don't require object creation directly assign to the varible..
		System.out.println(m.id);

	}
	static MethodTask1 m1(int id) {
		MethodTask1 mt = new MethodTask1();
		if (id == 101) {
			mt.id = 101;
			mt.name = "Oxford";
		} else if (id == 102) {
			mt.id = 102;
			mt.name = "Standford";
		}
		return mt;
		
	}

}
