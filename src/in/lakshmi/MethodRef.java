package in.lakshmi;

import java.util.ArrayList;
import java.util.Collections;

public class MethodRef {
public static void m2() {
	System.out.println("m2 method called");
}
public void m3() {
	for(int i=0;i<=5;i++) {
		System.out.println(i);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MethodRef mr = new MethodRef();
     MyInterface mi = MethodRef::m2;
     mi.m1();
    
     Runnable r = mr::m3;
     Thread t = new Thread(r);
     t.start();
     
     ArrayList<Integer> al = new ArrayList<>();
     al.add(2);
     al.add(1);
     al.add(5);
     al.add(4);
     Collections.sort(al,(i,j)->i<j?-1:1);
     System.out.println(al);
     
	}

}
