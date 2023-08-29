package in.lakshmi;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<String ,Integer> f = name -> name.length();
System.out.println(f.apply("ashok"));

BiFunction<Integer,Integer,Integer> bif = (a,b) -> a+b;
Integer sum = bif.apply(10,20);
System.out.println(sum);
	}

}
