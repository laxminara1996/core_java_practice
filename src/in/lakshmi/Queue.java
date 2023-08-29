package in.lakshmi;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {
	public static void main(String[] args) {
PriorityQueue<String> pq = new PriorityQueue<>();
      pq.add("laxmi");
      pq.add("raji");
      pq.add("rani");
      pq.add("eney");
      System.out.println(pq);
      System.out.println(pq.element());
      System.out.println(pq.peek());
      Iterator<String> itr = pq.iterator();
      while(itr.hasNext()) {
    	  System.out.println(itr.next());
      }
      pq.remove();
      pq.poll();
      System.out.println("last==="+pq);
      
	}

}
