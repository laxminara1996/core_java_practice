package in.lakshmi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapDemo {
public static void main(String[] args) {
 List<String> al = Arrays.asList("laxmi","rani","raju","ramu");
	//al.stream().map(a->a.toUpperCase()).forEach(a->System.out.println(a));
	//al.stream().mapToInt(a->a.length()).forEach(a->System.out.println(a));
	//al.stream().filter(a->a.startsWith("r"))
	//.map(a->a +"-"+a.length()).forEach(a->System.out.println(a));
	
	EmplStream es = new EmplStream("laxmi",25,30000.00);
	EmplStream es1 = new EmplStream("rani",22,35000.00);
	EmplStream es2 = new EmplStream("ramu",24,40000.00);
	EmplStream es3 = new EmplStream("raji",26,33000.00);
	EmplStream es4 = new EmplStream("ashok",30,75000.00);
    Stream<EmplStream> stream = Stream.of(es,es1,es2,es3,es4);
    List<EmplStream> empData = Arrays.asList(es,es1,es2,es3,es4);
    Optional<EmplStream> max = empData.stream().collect(Collectors.maxBy(Comparator.comparing(m->m.salary)));
    System.out.println("max value"+max.get().salary);
    Optional<EmplStream> min = empData.stream().collect(Collectors.minBy(Comparator.comparing(m->m.salary)));
    System.out.println("min value"+min.get().salary);
    Double avg = empData.stream().collect(Collectors.averagingDouble(a->a.salary));
    System.out.println(avg);
    Map<Object, List<EmplStream>> map = empData.stream().collect(Collectors.groupingBy(e->e.age));
    System.out.println(map);
   // stream.filter(e->e.salary>=40000.00).map(e->e.name+"-"+e.age).forEach(e->System.out.println(e));
    
    List<String> javacourses = Arrays.asList("coreJava","corejava","advjava","spring");
    List<String> uiocourses = Arrays.asList("html","css","bs","js");
    List<List<String>> courses = Arrays.asList(javacourses,uiocourses);
    courses.stream().forEach(c->System.out.println(c));
    Stream<String> fst = courses.stream().flatMap(c->c.stream());
    //fst.forEach(f->System.out.println(f));
    
    //javacourses.stream().limit(2).forEach(l->System.out.println(l));
   // javacourses.stream().skip(2).forEach(l->System.out.println(l));
    List<String> names = Arrays.asList("raja", "rani", "raja", "rani", "guru");
	names.stream().distinct().forEach(name -> System.out.println(name));
    //javacourses.stream().distinct().forEach(l->System.out.println(l));


}
}
class EmplStream{
	String name;
	int age;
	double salary;
	public EmplStream(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
}