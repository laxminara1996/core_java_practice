
public class EncapsulationTest {
public static void main(String[] args) {
		
		Encapsulation et = new Encapsulation();
		et.setId(101);
		et.setName("lakshmi");
		et.setAge(30);
		int id = et.getId();
		String name = et.getName();
		int age = et.getAge();
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}

}
