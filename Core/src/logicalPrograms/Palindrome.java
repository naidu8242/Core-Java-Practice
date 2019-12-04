package logicalPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your name");
		 String origenal,reverse = "";
		 origenal = sc.nextLine();
		 int length = origenal.length();
		 for(int i=length-1;i>=0;i--) {
			 reverse = reverse + origenal.charAt(i);
		 }
		 System.out.println("Reverse Name : " +reverse);
		 if(origenal.equalsIgnoreCase(reverse)) {
			 System.out.println("This is Palindrome");
		 }else {
			 System.out.println("This is  not Palindrome");
		 }
	}

}
