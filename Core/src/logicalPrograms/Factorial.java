package logicalPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter factorial nunber");
		int n = sc.nextInt();
		int result = factorial(n);
		System.out.println("Factorial is  :- " +result);
				

	}

	private static int factorial(int n) {
		int result = 1;
		for(int i=1;i<=n;i++) {
			result = result *i;
		}
		return result;
	}

}
