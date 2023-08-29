
public class Variables {
     int age;//instance variable
     static String college;//static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Variables v= new Variables();
		v.age = 20;
		System.out.println(v.age);
		
		
		Variables.college = "Gates";
		System.out.println(Variables.college);//static variable access by CLASS Name
		
		String name = "lakshmi";//local variable it will access only with in the method only
		System.out.println(name);

	}

}
