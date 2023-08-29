package in.lakshmi;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(5);
		
		// Approach-1
				for (int i = 0; i < al.size(); i++) {
					System.out.println(al.get(i));
				}
				System.out.println("======For-Each loop Approach=======");

				// Approach-2
				for (Object obj : al) {
					System.out.println(obj);
				}

				System.out.println("=====Iterator Approach=====");
				// Approach-3
				Iterator iterator = al.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}

				System.out.println("=====ListIterator Approach=====");

				// Approach-4
				ListIterator listIterator = al.listIterator();
				while (listIterator.hasNext()) {
					System.out.println(listIterator.next());
				}

				System.out.println("=====forEach ( ) Approach=====");

				// Approach-5
				al.forEach(i -> {
					System.out.println(i);
				});
				
				System.out.println("=====linkedList====");	
				
				LinkedList<Integer> li = new LinkedList<>();
				li.add(20);
				li.add(30);
				li.add(50);
				li.add(10);
				li.add(60);
				System.out.println(li);
				li.add(1, 15);
				System.out.println(li);
				System.out.println("=====by using vector====");	
				
				Vector<String> v = new Vector<>();
				v.add("laxmi");
				v.add("rani");
				v.add("naresh");
				v.add("raghu");
				v.add("sav");
				System.out.println(v);
				Enumeration<String> e = v.elements();
				while(e.hasMoreElements()) {
					System.out.println(e.nextElement());
				}
				System.out.println("=====by using stack====");	
				Stack<Integer> s = new Stack<>();
				s.push(20);
				s.push(30);
				s.push(50);
				s.push(10);
				s.push(60);
				s.peek();
				//s.pop();
				System.out.println(s); 
				Enumeration<Integer> es = s.elements();
				while(es.hasMoreElements()) {
					System.out.println(es.nextElement());
				}
				
				
		
	}

}
