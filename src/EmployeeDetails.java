
public class EmployeeDetails {
	
	EmployeeDetails(){//default constructor
		
	}
	int i;
	int j;
	int id;
	String name;
	int salary;
	int age;
	EmployeeDetails(int i,int j){
		this.i=i;
		this.j=j;
		System.out.println(this.i);
		System.out.println(this.j);
	}
	EmployeeDetails(int id,String name,double salary,int age){
		System.out.println(id+" "+name+"  "+salary+"  "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EmployeeDetails(1,2);
		EmployeeDetails sd1 = new EmployeeDetails(1,"rani",14000.0,25);
		EmployeeDetails sd2 = new EmployeeDetails(2,"raju",15000.0,26);
	}

}

