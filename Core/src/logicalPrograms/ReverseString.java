package logicalPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String reverse = "",str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		str = sc.nextLine();
		
//Method 1
		System.out.println("==== Method1 ====");
		String[] token = str.split("");
		for(int i=token.length-1; i>=0; i--) {
			System.out.println(token[i]);
		}
		
//Method 2
		System.out.println("==== Method2 ====");
		int length = str.length();
		for(int i=length-1;i>=0;i--) {
		 reverse =reverse + str.charAt(i);
		}
		System.out.println(reverse);
		
//Method 3 
		System.out.println("==== Method3 ====");
		String str1 = "Saket Saurav";
		char chars[] = str1.toCharArray(); // converted to character array and printed in reverse order
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]);
		}

	}

}
