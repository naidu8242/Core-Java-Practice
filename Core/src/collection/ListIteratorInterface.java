package collection;
import java.util.*; 
public class ListIteratorInterface {
	public static void main(String args[]) {
		ArrayList<String>  al = new ArrayList<String>();
		al.add("laxman");
		al.add("prasad");
		al.add("kiran");
		al.add(1,"raju");
		System.out.println("element at 2nd position "+al.get(2));
		ListIterator<String> li = al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("traversing elements in backward direction...");  
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
