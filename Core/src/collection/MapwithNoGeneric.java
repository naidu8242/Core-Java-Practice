package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapwithNoGeneric {
public static void main(String[] org) 
{
	Map map = new HashMap();
	map.put(101, "Apple");
	map.put(102, "Mango");
	map.put(103, "Orange");
	map.put(104,  "Bamanana");
	Set set = map.entrySet();
	Iterator it = set.iterator();
	while(it.hasNext()) {
		Map.Entry entry = (Map.Entry)it.next();
		System.out.println(entry.getKey() +" " + entry.getValue());
	}
	
	
}
}
