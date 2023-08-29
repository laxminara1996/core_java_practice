package in.lakshmi;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringJoiner sj = new StringJoiner("-");
		sj.add("ashok");
		sj.add("good");
		sj.add("morning");
		System.out.println(sj);
		StringJoiner sj1 = new StringJoiner("=","(",")");
		sj1.add("ashok");
		sj1.add("good");
		sj1.add("morning");
		System.out.println(sj1);
	}

}
