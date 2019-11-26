package parties;
import java.util.Scanner;

public class test {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        int i = scanner.nextInt();
        if(i % 2 == 0) {
        	System.out.println("prime");
        }
        scanner.close();
    }
}
