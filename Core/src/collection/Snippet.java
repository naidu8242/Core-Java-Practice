package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Snippet {
	public static void main(String[] args) {
		Map<Integer,String> map  = new HashMap<Integer,String>();
		map.put(1, "PLKD");
		map.put(2, "SKLM");
		map.put(3, "VSKP");
		map.put(4, "PVPT");
		
		System.out.println("Looping with keyset");
		
		Set<Integer> city = map.keySet();
		for(Integer t : city) {
			System.out.println("Key is"  + t +   "value is "+map.get(t));
		}
		
		System.out.println("Looping with entryset");
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("key  "+entry.getKey()+  "Value "+entry.getValue());
		}
		
		System.out.println("Looping with entryset and iterater");
		
		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println("Key" +entry.getKey() + "Value "+entry.getValue() );
		}
		
	}
}

