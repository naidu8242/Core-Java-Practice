package parties;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteration {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("laxman", 1);
		map.put("rana", 2);
		map.put("manu", 3);
		System.out.println("=== While loop========");
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry mp = it.next();
			
			System.out.println(mp.getKey() +" " +mp.getValue());
		}
		
		System.out.println("====For loop=======");
		for(Map.Entry e:map.entrySet()) {
			System.out.println(e.getKey() +" "+e.getValue());
		}
		
		System.out.println("====== java 8=====");
		map.forEach((k,v)->System.out.println(k +" " +v));
	
	
	}


	
}
