package in.lakshmi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailPassDemo {
public static void main(String[] args) {
	// Fail Fast Collection
			ArrayList<Integer> al = new ArrayList<>();

			al.add(100);
			al.add(200);
			al.add(300);
			al.add(400);

			for (int i : al) {
				System.out.println(i);
				if (i == 100) {
					//al.add(150);
				}
			}
			
			
			// Fail Safe Collection
			CopyOnWriteArrayList<Integer> ali = new CopyOnWriteArrayList<>();

			ali.add(100);
			ali.add(200);
			ali.add(300);
			ali.add(400);

			for (int i : ali) {
				System.out.println(i);
				if (i == 100) {
					ali.add(150);
				}
			}
			System.out.println(ali);
			
			
			
			
			HashMap<Integer,String> map = new HashMap<>();
			
			map.put(101, "one");
			map.put(102, "two");
			map.put(103, "three");
			
			Set<Integer> keySet = map.keySet();
			Iterator<Integer> iterator = keySet.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
				//map.put(104, "four");
			}
			
			
			ConcurrentHashMap<Integer, String> map1 = new ConcurrentHashMap<>();

			map1.put(101, "one");
			map1.put(102, "two");
			map1.put(103, "three");

			Set<Integer> keys = map1.keySet();
			Iterator<Integer> iter = keys.iterator();
			while (iter.hasNext()) {
				System.out.println(iter.next());
				map.put(104, "four");
			}
			
			System.out.println(map);
}
}
