package in.lakshmi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<Integer> stream = Stream.of(1,2,3,4);
		ArrayList<String> al = new ArrayList<>();
		al.add("laxmi");
		al.add("rani");
		al.add("raju");
		/*Stream<String> name = al.stream();
		Stream<String> filteredStream = name.filter(s->s.charAt(0)=='l');
		filteredStream.forEach(s-> System.out.println(s));*/
		al.stream().filter(s->s.charAt(0)=='l').forEach(s-> System.out.println(s));
		
		StreamUser su = new StreamUser("anuska",30);
		StreamUser su1 = new StreamUser("ashok",22);
		StreamUser su2 = new StreamUser("asha",29);
		StreamUser su3 = new StreamUser("rani",20);
		StreamUser su4 = new StreamUser("raju",23);
		StreamUser su5 = new StreamUser("yuvan",10);
		Stream<StreamUser> names = Stream.of(su,su1,su2,su3,su4,su5);
       // names.filter(s->s.age>=20).forEach(s->System.out.println(s));
        
       // names.filter(s->s.age>=20 && s.name.charAt(0)=='a').forEach(s->System.out.println(s));
        names.filter(s->s.age>20).filter(s->s.name.startsWith("a"))
        .forEach(s->System.out.println(s));
		
	}

}
class StreamUser{
	String name;
	int age;
	public StreamUser(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "StreamUser [name=" + name + ", age=" + age + "]";
	}
	
	
}
