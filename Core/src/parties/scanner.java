package parties;
import java.util.Scanner;
public class scanner {

	public static void main(String args[]) {
		Scanner sca = new Scanner(System.in);
		int i = sca.nextInt();
		double d = sca.nextDouble();
		String s = sca.next();
		
		
		System.out.println("integer value "+i);
		System.out.println("double value "+d);
		System.out.println("String value "+s);
		
	}
}
