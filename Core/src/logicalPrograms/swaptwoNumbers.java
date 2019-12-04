package logicalPrograms;

import java.util.Scanner;

public class swaptwoNumbers {

	public static void main(String[] args) {
		
//method1
		System.out.println("===== Method1 ======");
		int a,b,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before Swapping numbers : "+a+b);
		
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping numbers : "+a+b);
		
		System.out.println("===== Method2 ======");
//method2
		int x,y;
		
		Scanner sce =new Scanner(System.in);
		System.out.println("Enter your Numbers");
		x = sce.nextInt();
		y = sce.nextInt();
		
		System.out.println("Before swapping \nx= " +x+"\ny= " +y);
		x =x+y;
		y = x-y;
		x = x-y;
		System.out.println("after swapping \nx= " +x+"\ny= " +y);
		
		
	}

}
