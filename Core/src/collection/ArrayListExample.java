package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("F");
		list.add("B");
		list.add("D");
		list.add("A");
		list.add("C");
		list.add("E");
		
		System.out.println(list);
		
		list.add(2, "X");
		
		System.out.println(list);
		
		list.remove("X");
		
		System.out.println(list);
		list.forEach(li->System.out.println(li));
		
		System.out.println("============== No Copies ==============");
		ArrayList<Integer> alist = new ArrayList<Integer>(Collections.nCopies(10, 5));
		alist.forEach(al->System.out.println(al));
		
		System.out.println("======== Array list sorting =====");
		Collections.sort(list);
		list.forEach(al->System.out.println(al));
		
		
		System.out.println("======== comparable and comparator? =====");
		   
		ArrayList<String> st = new ArrayList<String>();
		st.add("X");
		st.add("Y");
		st.add("Z");
		
		list.addAll(st);
		list.forEach(ts->System.out.println(ts));
		
		System.out.println("======== Sublist =====");
		List<String> ts = list.subList(1,5);
		ts.forEach(li->System.out.println(li));
		
		System.out.println("======== Clone =====");

		ArrayList<String> yes = (ArrayList<String>)list.clone();
		yes.remove(4);
		yes.add("orange");
		yes.forEach(ha->System.out.println(ha));
		
		
		System.out.println("======= ArrayToArrayList  =========");
		String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};

		ArrayList<String> as = new ArrayList<>(Arrays.asList(citynames));
		as.add("HYD");
		as.add("SKLM");
		as.forEach(sa->System.out.println(sa));
		
		
	}
}
