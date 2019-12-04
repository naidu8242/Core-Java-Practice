package logicalPrograms;

import java.util.Scanner;

public class drawPyramidPattern {

	public static void main(String[] args) {
		System.out.println("Enter your Number of pyramids : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();		
		for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

	}

}
