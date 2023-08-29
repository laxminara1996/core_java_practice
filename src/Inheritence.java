
class user{
	int id;
String name;
public user() {
	System.out.println("0 param constructor");
}
}
public class Inheritence extends user {
int rank;
public Inheritence() {
	System.out.println("child constructor");
}
void m2() {
	System.out.println("method called");
}
public static void main(String[] args) {
	Inheritence i = new Inheritence();

	i.id = 101;
	i.name = "lakshmi";//parent properties once we create child object accquire the parent properties also
	i.rank = 1;//child property
	System.out.println(i.id +"   "+i.name+"     "+i.rank);
	
}
}
