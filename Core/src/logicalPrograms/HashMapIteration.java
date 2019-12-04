package logicalPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {

	public static void main(String[] args) {
		
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	hm.put(1, "bat");
	hm.put(2, "Ball");
	hm.put(6, "nobe");
	hm.put(3, "wickets");
	hm.put(4, "runs");
	hm.put(5, "wideball");
	
	System.out.println("=== Java 8 forEach iteration ========");
	hm.forEach((k,v)->System.out.println(k +v));

	System.out.println("======== while loop =======");
	
	Iterator it = hm.entrySet().iterator();
	while(it.hasNext()) {
		Map.Entry et = (Map.Entry)it.next();
		System.out.println(et.getKey()+ " " +et.getValue());
	}

	System.out.println("======== for loop ======");
	for(Map.Entry map :hm.entrySet()) {
		System.out.println(map.getKey() +" "+map.getValue());
	}
	

	}

}
