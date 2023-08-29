package in.lakshmi;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("serial stream");
       Stream<Integer> ss = Stream.of(1,2,3,5);
       ss.forEach(s->System.out.println(s+"::"+Thread.currentThread()));
       System.out.println("parallel stream");
       Stream<Integer> ps = Stream.of(1,2,3,5);
       ps.parallel().forEach(p->System.out.println(p+"::"+Thread.currentThread()));
       
       List<String> list = Arrays.asList("laxmi","rani","nag");
       Spliterator<String> spltr = list.stream().spliterator();
       spltr.forEachRemaining(e->System.out.println(e));
	}

}
