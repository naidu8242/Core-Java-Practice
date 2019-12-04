package logicalPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Bat");
		al.add("Cat");
		al.add("Dall");
		al.add("Eat");
		al.add("Fox");
		
		System.out.println("=== java8 forEach =======");
		al.forEach(a->System.out.println(a));
		
		System.out.println("=== While loop =======");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("=== For loop =======");
		for(String str:al) {
			System.out.println(str);
		}
		
	}

}
