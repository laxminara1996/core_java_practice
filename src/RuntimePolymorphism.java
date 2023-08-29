import java.io.*;
class bank {
	double rateOfIntrest() {
		return 10.5;
	}
}
public class RuntimePolymorphism extends bank {
 int rateOfIntrest(int amount,int rate,int time) {
	 int timeindays = time*365;
	int value = (amount*timeindays*rate)/100;
	return value;
}
public static void main(String[] args) throws Exception  {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String str1 = br.readLine();
	String str2 = br.readLine();
	String str3 = br.readLine();
	System.out.println("enter the principle amount:");
	int amount = Integer.parseInt(str1);
	System.out.println("enter the rate of intrest:");
	int rate = Integer.parseInt(str2);
	System.out.println("enter the time period:");
	int time = Integer.parseInt(str3);
	RuntimePolymorphism  rp= new RuntimePolymorphism();
	int amt = rp.rateOfIntrest(amount,rate,time);
	
	
	System.out.println("total amount is:"+amt);
}
}
//skip the parent class method to access our own method then we use methodoverrding .

//string classes are checking content
//object classes are checking addresses.