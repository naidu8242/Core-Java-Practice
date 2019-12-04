package logicalPrograms;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class arrayDuplicate {

	public static void main(String[] args) {
		int i[]= {1,2,3,4,5,1,2,3};
		TreeMap<Integer, Integer> hm = new TreeMap<>();
		for(int element:i) {
			if(hm.get(element) == null) {
				hm.put(element, 1);
			}else {
				hm.put(element, hm.get(element)+1);
			}
		}
		hm.forEach((k,v)->System.out.println(k +" = "+v));
		System.out.println("===== ==========");
		hm.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).forEach(pair->System.out.println(pair.getKey() +" = "+pair.getValue()));
	}

}
