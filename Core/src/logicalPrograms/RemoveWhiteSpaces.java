package logicalPrograms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str1 = "Saket Saurav        is a QualityAna    list";
		String s2 = str1.replaceAll(" ", "");
		System.out.println(s2);

	}

}
