package in.lakshmi;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Consumer<String> c = (name) -> System.out.println(name+ ",Good evening");
   c.accept("ashok");
  c.accept("hyd");

	}

}
