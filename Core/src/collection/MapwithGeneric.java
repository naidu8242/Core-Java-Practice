package collection;

import java.util.HashMap;
import java.util.Map;

public class MapwithGeneric {
public static void main(String[] org) 
{
	Map<Integer,String> map = new HashMap<Integer,String>();
	map.put(101, "Apple");
	map.put(102, "Mango");
	map.put(103, "Orange");
	map.put(104,  "Bamanana");
	for(Map.Entry m:map.entrySet()){
	System.out.println(m.getKey() +" "+ m.getValue());
	}
	
	
}
}
