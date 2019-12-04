package logicalPrograms;

import java.util.Scanner;

/**
 * Armstrong formula 
 * a = n%10;
 * n = n/10;
 * c+(a*a*a); 
 *Ex is Amstrong 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
 * @author Laxman
 */
public class Armstrong {

	public static void main(String[] args) {
		int c= 0,a,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amstrong number");
		int n = sc.nextInt();
		temp = n;
		while(n>0) {
			a = n%10;
			n = n/10;
			c = c + (a*a*a);
		}
		if(temp==c) {
			System.out.println("Amstrong number");
		}else {
			System.out.println("Not Amstrong number");
		}
	}

}
