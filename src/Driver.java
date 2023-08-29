
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Driver d = new Driver();
       Student s = new Student();
       s.id = 1;
       s.name = "lakshmi";
       d.print(s);
       Employee e = new Employee();
       e.id = 85;
       e.salary = 15000.0;
       d.printEmployee(e);
       Person p = d.m1();//get multiple data return
       Person p1 = d.m2(101);
       System.out.println(p.id +"  "+p.pname+"    "+p.age);
       System.out.println(p1.id+"   "+p1.pname+"====="+p1.age);
	}
	void print(Student s) {
		System.out.println(s.id + "---"+s.name);
	}
	void printEmployee(Employee e) {
		System.out.println(e.id +"   "+e.salary);
	}
    Person m1() {
    	Person p = new Person();
    	p.id = 2;
    	p.pname = "lakshmi";
    	p.age = 28;	//set data
    	return p;
    }
    Person m2(int id) {
    	Person p = new Person();
    	if(id ==101) {
    		p.id = 101;
    		p.pname = "rani";
    		p.age = 26;
    	}else if(id ==101) {
    		p.id = 102;
		p.pname = "raju";
		p.age = 28;
    }
    	return p;
    }
    
}
class Student{
	int id ;
	String name;
}
class Employee{
	int id;
	double salary;
}
class Person{
	
	int id ;
	String pname;
	int age;
}