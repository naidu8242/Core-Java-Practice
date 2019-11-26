package parties;
// PROGRAM TO DO SOME OPERATIONS ON THE LIST OF JAVA COLLECTOIONS
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class ReturnDoubleList{
// function logic to double the value of the given list
	
public void getDoubleValueOfTheGivenList(ArrayList<Integer> iterateIntList){
System.out.println(" Success ::");
Iterator i = iterateIntList.iterator();
while (i.hasNext()) {
    System.out.println(i.next());
 }

 
 
}



public static void main(String[] args){
Scanner sc = new Scanner(System.in);
// creating the arrayList of the integer type
ArrayList<Integer> intList = new ArrayList<Integer>();
System.out.println("Enter the element into the list");
for(int i=1; i<=5; i++){
int userInput = sc.nextInt();
intList.add(userInput);
}
System.out.println("your inserted value into the list as follow");
System.out.println(intList);
// creating object of this class
ReturnDoubleList obj = new ReturnDoubleList();
obj.getDoubleValueOfTheGivenList(intList);
}
}