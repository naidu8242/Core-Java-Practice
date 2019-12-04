package logicalPrograms;

import java.util.Scanner;

/**
 * FibonacciSeries Logic
 * a = b;
 * b = c;
 * c = a + b;
 * @author Laxman
 *
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		int num,a=0,b=0,c=1;
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i=0;i<=num;i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a);
		}
		
	}

}
