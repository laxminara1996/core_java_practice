import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Customer {
	String name;
	String email;
	String mobile;
	String aadhar;
	void m1(Customer p1) {
		System.out.println(p1.name+"---"+p1.email+"---"+p1.mobile+"------"+p1.aadhar);
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String name = br.readLine();
		String email = br.readLine();
		String mobile = br.readLine();
		String aadhar = br.readLine();
		Customer c = new Customer();
		Customer c2 = new Customer();
		c.name = name;
		c.email = email;
		c.mobile = mobile;
		c.aadhar = aadhar;
		c2.m1(c);
	}

}
