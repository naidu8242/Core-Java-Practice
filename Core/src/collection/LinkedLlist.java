package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedLlist {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();

	     //Adding elements to the Linked list
	     list.add("Steve");
	     list.add("Carl");
	     list.add("Raj");
	     
	     list.addFirst("Yello");
	     
	     list.addLast("Red");
	     
	     list.add(2,"Hai");
	     
	     list.forEach(li->System.out.println(li));
	     
	     System.out.println("====== While loop iteration ==========");
	     Iterator it = list.iterator();
	     while(it.hasNext()) {
	    	 System.out.println(it.next());
	     }
	     
	     System.out.println(list);
	     
	     System.out.println("====== Adding ==========");
	     List<String> list2=new ArrayList<String>();
	     
	     list2.add("A");
	     list2.add("B");
	     list2.add("C");
	     
	     list.addAll(list2);
	     
	     list.forEach(fr->System.out.println(fr));
	}

}
