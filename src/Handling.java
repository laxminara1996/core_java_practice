
public class Handling {
	public static void main(String[] args) {
		/*try {
			System.out.println("in start try block");
			String s = null;
			System.out.println(s.length());
			System.out.println("in end try block");
		} catch (ArithmeticException e) {
			System.out.println("in catch block");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("in catch block 2");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally - block");
		}*/

		System.out.println("main() - method started");
		Handling d = new Handling();
		d.m1(10, 0);
		System.out.println("main() - method ended");

	}

	void m1(int a, int b) {
		System.out.println("m1() - started");
		try {
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
         e.printStackTrace();
		}
		System.out.println("m1() - ended");
	}

}
