package in.lakshmi;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
public static void main(String[] args) {
	Map<Integer,String> m = new HashMap<>();
	m.put(1,"laxmi");
	m.put(2,"rani");
	m.put(3,"rajesh");
	System.out.println(m.size());
	System.out.println(m.entrySet());
	System.out.println(m.keySet());
	System.out.println(m.values());
	System.out.println(m.containsKey(1));
	System.out.println(m.get(2));
	System.out.println(m.remove(3));
	Collection<String> values = m.values();
	for(String v : values) {
		System.out.println(v);
	}

	Set<Integer> keySet = m.keySet();
	for (Integer key : keySet) {
		System.out.println(key +"--"+m.get(key));
	}

	Set<Entry<Integer, String>> entrySet = m.entrySet();

	for(Entry<Integer,String> entry : entrySet) {
		System.out.println(entry.getKey()+"--"+entry.getValue());
	}
	
}
}
