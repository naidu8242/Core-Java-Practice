package parties;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class reverseString {
 public static void main(String[] args) {
    String input = "Be in present";
    char[] temparray= input.toCharArray();
    int left,right=0;
    right=temparray.length-1;
    for (left=0; left < right ; left++ ,right--)
    {
     // Swap values of left and right 
     char temp = temparray[left];
     temparray[left] = temparray[right];
     temparray[right]=temp;
    }
    for (char c : temparray)
     System.out.print(c);
    System.out.println();
    
    System.out.println("=============== List related iteration ===========");
    String input1 = "Be in present";
    char[] hello=input1.toCharArray();
    List<Character> trial1= new LinkedList<>();
    for(char c: hello)
    trial1.add(c);
    Collections.reverse(trial1);
    ListIterator li = trial1.listIterator();  
    while(li.hasNext())
         {System.out.print(li.next());}  
    
    
    
    System.out.println("=========== Scaner Reverse String ==============");
    String inp = "";
    System.out.println("Enter Your Name");
    Scanner sc = new Scanner(System.in);
    inp = sc.next();
    char[] try1 = inp.toCharArray();
    for (int i=try1.length-1;i>=0;i--)
        System.out.print(try1[i]);
    
    
    
    
    
    
    
    
    
      
   }
 }