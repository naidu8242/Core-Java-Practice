package logicalPrograms;

import java.util.Scanner;

public class primeNumberOrNot {

	public static void main(String[] args) {
		int temp, num;
		 boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your number");
		num = sc.nextInt();
		sc.close();
		for(int i=2; i <= num/2; i++) {
			temp = num%i;
			if(temp == 0) {
				isPrime = false;
			break;
			}
		}
		if(isPrime)  
			System.out.println(num+" this prime number");
		else 
			System.out.println(num+" this not prime number");
	}

}
