package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

import parties.Laptop;

//After using lambda expression using this code is not nessary
class myComparator implements Comparator<Integer>
{
	public int compare(Integer i1, Integer i2) {
		return (i1>i2) ? -1 : (i1<i2) ? 1 : 0;
	}
	
}

public class comparator {
	public static void main(String args[]) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(0);
		ar.add(20);
		ar.add(15);
		ar.add(50);
		System.out.println("Before Sorting");
		System.out.println(ar);

		System.out.println("After Sorting");
		Collections.sort(ar);
		System.out.println(ar);
		
		
		System.out.println("Own Customise Sorting");
		Collections.sort(ar, new myComparator());
		System.out.println(ar);
		
		
		System.out.println("Lambda Expression Sorting");
		Collections.sort(ar, (i1,i2)->(i1>i2)?-1 :(i1<i2)?1:0);
		System.out.println(ar);
		
		
		
		System.out.println("*********** Tree set Example ***********");
		//Before lambda expression using comparator order is Desc 
		//(i1,i2) -> (i1>i2)?-1 : (i1<i2)?1:0
		//[25, 20, 15, 10, 5]
		
		//Not apply for the TreeSet object by default Ass order
		//[5,10,15,20,25]
		TreeSet<Integer> ts = new TreeSet<Integer>((i1,i2) -> (i1>i2)?-1 : (i1<i2)?1:0);
		
		ts.add(10);
		ts.add(05);
		ts.add(25);
		ts.add(15);
		ts.add(20);
		
		System.out.println(ts);
		
		System.out.println("********** Tree map ************");
		//Before lambda expression using comparator order is Desc 
		//(i1,i2) -> (i1>i2)?-1 : (i1<i2)?1:0
		//{6=Vasu, 5=Kesav, 3=Mahesh, 2=Ramana, 1=Laxman}
		
		//Not apply for the TreeMap object by default Ass order
		//{1=Laxman, 2=Ramana, 3=Mahesh, 5=Kesav, 6=Vasu}
		TreeMap<Integer,String> tm  = new TreeMap<Integer,String>();
		
		tm.put(5, "Kesav");
		tm.put(2, "Ramana");
		tm.put(3, "Mahesh");
		tm.put(1, "Laxman");
		tm.put(6, "Vasu");
		
		System.out.println(tm);

		
		
		System.out.println("Custome object Lambda Expression");
        List<Laptop> lap = new ArrayList<Laptop>();
		
		lap.add(new Laptop("Dell",45000,18));
		lap.add(new Laptop("Acer",15000,16));
 		lap.add(new Laptop("Hp",25000,8));
		 
		Collections.sort(lap,(l1,l2) ->(l1.price > l2.price) ? 1:-1);
		for(Laptop ra:lap) {
			System.out.println(ra);
			}
		
	}
}
