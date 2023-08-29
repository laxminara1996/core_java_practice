
public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MethodExample me = new MethodExample();
      College c = me.m();
      Player p = me.printPlayerData(18);
      System.out.println(p.pname);
      System.out.println(c.id + "   "+c.name);
      
	}
	College m() {
		College c = new College();
		c.id = 525;
		c.name = "laxmi";
		return c;
	
		
	}
	Player printPlayerData(int id) {
		Player  p = new Player();
		if(id == 7) {
			p.pname = "Dhoni";
		}else if(id == 18){
			p.pname = "Kohli";
		}else if(id == 45){
			p.pname = "Rohit Sharma";
		}else {
			p.pname = null;
		}
		
		return p;
	}

}
class College{
	int id;
	String name;
}
class Player{
	
	int id;
	String pname;
	int age;
}