package collection;

import java.util.HashMap;
import java.util.Map;

public class HasMap {
public static void main(String[] org) 
{
	HashMap<Integer,String > hm = new HashMap<Integer,String>();
	hm.put(1, "One");
	hm.put(2, "Two");
	hm.put(3, "Three");
	hm.put(4,"Foure");
	System.out.println("Before remove the Map"+hm);
	hm.remove(4);
	System.out.println("After Remove the Map"+hm);
	for(Map.Entry m : hm.entrySet()) {
		System.out.println(m.getKey() +" "+ m.getValue());
	}
	
	
}
}
