

public class Task2 {
int id;
String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task2 p = new Task2(); // obj1 created

		Task2 p1 = new Task2(); // obj2 created
		p1.id = 101;
		p1.name = "Raju";

		Task2 p2 = new Task2(); // obj3 created
		p2.id = 102;
		p2.name = "Rani";
		p.m1(p1, p2);
		
		Task2[] arr =p.m2();
       for(Task2 person :arr) {
    	   System.out.println(person.id+"  "+person.name);
       }
      
	}
    void m1(Task2 p1, Task2 p2) {
    System.out.println(p1.id);	
    System.out.println(p2.id);
    }
     Task2[] m2() {
    	 Task2 p1 = new Task2();
    	p1.id = 1;
    	p1.name = "lakshmi";
    	Task2 p2 = new Task2();
    	p2.id = 2;
    	p2.name = "lak";
    	Task2 p3 = new Task2();
    	p3.id = 3;
    	p3.name = "la";
    	Task2[] arr= {p1,p2,p3};
    	return arr;
    }
}
