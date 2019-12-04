package logicalPrograms;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class RomanNumberToInteger {
	 private final static LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
	 static {
		 hm.put("M", 1000); hm.put("CM", 900); hm.put("D", 500);  hm.put("CD", 400);
		 hm.put("C", 100);  hm.put("XC", 90); hm.put("L", 50); hm.put("LX", 40);
		 hm.put("X", 10);  hm.put("IX", 9);  hm.put("V", 5);  hm.put("IV", 4);
		 hm.put("I", 1);
	 }
	 private static Integer toInteger(String roman) {
			for(String key:hm.keySet()) {
				if(roman.startsWith(key)) {
					if(roman.equals(key)) {
						return hm.get(key);
					}
					return hm.get(key) + toInteger(roman.substring(key.length()));
				}
			} return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Roman number");
		String str = sc.nextLine();
		System.out.println("Roman >>>"+toInteger(str));

	}



	

}
