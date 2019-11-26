package parties;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class duplicateStringCountProgram{

	
	public static void main(String args[]) {
		getduplicateValueNumber("I am am learn java java program ok ok ok");
	}

	private static void getduplicateValueNumber(String string) {
		HashMap<String,Integer> mapIt = new HashMap<>();
		String[] split = string.split(" ");
		for(String sr:split) {
			if(mapIt.get(sr) != null) {
				mapIt.put(sr, mapIt.get(sr)+1);
			}else {
				mapIt.put(sr, 1);
			}
		}
		System.out.println(mapIt);
		Iterator<String> it = mapIt.keySet().iterator();
		while(it.hasNext()) {
			String temp = it.next();
			if(mapIt.get(temp) > 1) {
				System.out.println("The word "+temp +" appered "+mapIt.get(temp) +" No of items");
			}
		}
	}
	
}