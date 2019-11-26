package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "Apple");
		hm.put(2, "Banana");
		hm.put(3, "Cherry");
		hm.put(4, "Damson");
		
		hm.forEach((k,v)->System.out.println(k +" & "+v));
		System.out.println("===  While loop ==========");
		
		Iterator it = hm.entrySet().iterator();
		while(it.hasNext()) {
			 Map.Entry me2 = (Map.Entry) it.next();
			 System.out.println(me2.getKey() +" "+me2.getValue());
		}
		
		System.out.println("======== For loop ======");
		for(Map.Entry map:hm.entrySet()) {
			System.out.println(map.getKey() +""+map.getValue());
		}

		System.out.println("===  Clone  ==========");

		HashMap<Integer,String> hm2 = new HashMap<Integer,String>();
		hm2 = (HashMap)hm.clone();
		
		hm2.forEach((a,b)->System.out.println(a + b));
		
		System.out.println("===  Reverser Order  ==========");
		
		Map<Integer,String> mp = new TreeMap<Integer,String>(Collections.reverseOrder());
		mp.putAll(hm2);
		mp.forEach((e,f)->System.out.println(e+f));
		
		
	}

}
