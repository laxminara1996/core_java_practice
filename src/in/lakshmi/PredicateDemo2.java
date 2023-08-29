package in.lakshmi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PredicatePerson p0 = new PredicatePerson("laxmi",26);
		PredicatePerson p1 = new PredicatePerson("rani",30);
		PredicatePerson p2 = new PredicatePerson("rajini",25);
		PredicatePerson p3 = new PredicatePerson("raju",23);
		PredicatePerson p4 = new PredicatePerson("nag",29);
		List<PredicatePerson> persons = Arrays.asList(p0,p1, p2, p3, p4);
		Predicate<PredicatePerson> pp = p-> p.age>=25;
		for(PredicatePerson person:persons) {
			if(pp.test(person)) {
				System.out.println("persons data--"+person.name);
			}
		}
		String[] names = {"anjali","anushka","ashok","rani","rajini","mahesh"};
		Predicate<String> p = name -> name.charAt(0)=='a';
		for(String name:names) {
			if(p.test(name)) {
				System.out.println(name);
			}
		}
	}
	

}
class PredicatePerson {
	String name;
	int age;
	public PredicatePerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}