package parties;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparableAndComparator {

	public static void main(String args[]) {
		
		List<Laptop> lap = new ArrayList<Laptop>();
		
		lap.add(new Laptop("Dell",45000,18));
		lap.add(new Laptop("Acer",15000,16));
 		lap.add(new Laptop("Hp",25000,8));
		
		Comparator<Laptop> com = new Comparator<Laptop>() {
			public int compare(Laptop l1,Laptop l2) {
				if(l1.getRam() > l2.getRam())
					return 1;
				else 
					return -1;
			}
		};
		
		Collections.sort(lap,com);
		for(Laptop lt:lap) {
			System.out.println(lt);
		}
		
		
	}
}


/**
 * Ca
 */

