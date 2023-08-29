package in.lakshmi;

import java.util.Optional;
import java.util.Scanner;

public class OptionalMsgService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		OptionalDemoUser od = new OptionalDemoUser();
		String name = od.getUserNameById(id);
		String msg = name.toUpperCase() + ", Hello";
		System.out.println(msg);
		
		
		Optional<String> uname = od.getUsername(id);
		if(uname.isPresent()) {
			String username = uname.get();
			System.out.println(username.toUpperCase()+",hello");
		}else {
			System.out.println("no data");
		}
		
	}

}
