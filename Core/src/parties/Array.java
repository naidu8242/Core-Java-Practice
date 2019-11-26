package parties;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Array {
//Duplicate elements removing by Array 	
public static void main(String[] args) {
	//Duplicate elements removing by Array 
	
	/*String[] apple = {"a","b","c","a","c"};
	for (int i = 0; i < apple.length; i++) {
		for (int j = i+1; j < apple.length; j++) {
			if(apple[i] == apple[j]) {
				System.out.println(apple[i]);
			}
		}
	}*/
	
	
	//Reverse String using StringBuffer
	/*StringBuffer sb = new StringBuffer("Hello This");
	sb.reverse();
	System.out.println("from StringBuffer::::"+sb);*/
	
	//Reverse String using String
	/*String s= "Hello This";
	String rev = "";
	for (int i = s.length()-1; i >= 0; --i) {
		rev = rev + s.charAt(i);
	}
	System.out.println("from String::::"+rev);*/
	
	
	//Factorial 
	/*int fact=1,number=5;  
	  for(int i=1;i<=number;i++){    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+number+" is: "+fact);  */
	
	  //Febonic serices
	 int n1=0,n2=1,n3,i,count=10;  
	 //System.out.print(n1+" "+n2);//printing 0 and 1  
	 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed  
	 {  
	  n3=n1+n2;  
	 // System.out.print(" "+n3);  
	  n1=n2;  
	  n2=n3;  
	 }  
	 
	 
	 //HashMap iteration
	 HashMap<String, String> map = new HashMap<String, String>();
	 map.put("1", "hello");
	 map.put("2", "hi");
	 map.put("3", "oye");
	 for(Map.Entry<String, String> ma : map.entrySet()) {
		 //System.out.println(ma.getKey() +","+ ma.getValue());
	 }
	 
	//HashMap iteration using Iterator and With Generics:
	 Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
	 while(it.hasNext()) {
		 Map.Entry<String, String> pair = it.next();
		 //System.out.println(pair.getKey() +","+ pair.getValue());
	 }
	 
	//HashMap iteration using Iterator and Without Generics:
	 Map map1 = new HashMap();
	 map1.put("1", "hello");
	 map1.put("2", "hi");
	 map1.put("3", "oye");
	 Iterator entries = map1.entrySet().iterator();
	 while (entries.hasNext()) {
	     Map.Entry entry = (Map.Entry) entries.next();
	     String key = (String)entry.getKey();
	     String value = (String)entry.getValue();
	    //System.out.println("Key = " + key + ", Value = " + value);
	 }
	 
	 
	 Map<String,String> gfg = new HashMap<String,String>();
     // enter name/url pair
     gfg.put("GFG", "geeksforgeeks.org");
     gfg.put("Practice", "practice.geeksforgeeks.org");
     gfg.put("Code", "code.geeksforgeeks.org");
     gfg.put("Quiz", "quiz.geeksforgeeks.org");
      
     // forEach(action) method to iterate map
     gfg.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));
	 
	 
	 System.out.println("============================================");
	 //common array of string array
	 String[] array1 = {"java","scala","sql"};
	 String[] array2  = {".net","java scipt","java","sql","mysql","scala"};
	 for(String s2:array2) {
		 for(String s1:array1) {
			 if(s2==s1) {
				 System.out.println(s2);
			 }
		 }
	  }

	 System.out.println("========== palindrome ==============");
	 
	 Scanner scr = new Scanner(System.in);
	 String str,rev ="";
	 System.out.println("Enter a string");
	 str = scr.nextLine();
	 int length = str.length();
	 for(int j = length - 1; j >= 0; j--)
	 rev = rev + str.charAt(j);
	 if(rev.equals(str)) {
		 System.out.println(str +"is palindrome");
	 }else {
		 System.out.println(str +"is not palindrome");
	 }
	 
	 
	
	
}


}
