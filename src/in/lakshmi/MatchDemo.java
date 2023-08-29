package in.lakshmi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatchDemo {
public static void main(String[] args) {
	PersonStream p1 = new PersonStream("John", "USA");
	PersonStream p2 = new PersonStream("Steve", "JAPAN");
	PersonStream p3 = new PersonStream("Ashok", "INDIA");
	PersonStream p4 = new PersonStream("Ching", "CHINA");	
	List<PersonStream> persons = Arrays.asList(p1,p2,p3,p4);
	boolean status = persons.stream().anyMatch(p->p.country.equals("INDIA"));
	System.out.println(status);
	boolean status1 = persons.stream().allMatch(p->p.country.equals("INDIA"));
	System.out.println(status1);
	boolean status2 = persons.stream().noneMatch(p->p.country.equals("MEXICO"));
	System.out.println(status2);
	List<PersonStream> data = persons.stream().filter(d->d.country.equals("INDIA")).collect(Collectors.toList());
    data.forEach(d->System.out.println(d));
    
    List<String> names = persons.stream()
			.filter(p -> p.country.equals("INDIA"))
			.map(p -> p.name)
			.collect(Collectors.toList());
System.out.println(names);

}
}
class PersonStream{
	String name;
	String country;
	PersonStream(String name,String country){
		this.name =name;
		this.country = country;
	}
}