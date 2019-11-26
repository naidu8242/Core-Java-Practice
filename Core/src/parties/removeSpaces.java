package parties;
public class removeSpaces {
	public static void main(String[] args) {
		  
	      StringBuilder str = new StringBuilder("and (");
	      System.out.println("string = " + str);

	      // deleting character from index 4 to index 9
	      str.delete(0, 3);
	      System.out.println("After deletion = " + str);

	      str = new StringBuilder("amit");
	      System.out.println("string = " + str);
	      
	      // deleting character at index 2
	      str.deleteCharAt(2);
	      System.out.println("After deletion = " + str);
	   }
	/*
	public static void main(String[] args) {
		String s = "[Hello]";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		
		String str = "[123,456,789]";


		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(str);

		List<Long> list = new ArrayList<Long>();

		 while (matcher.find()) {
		System.out.println(matcher.group());
		list.add(Long.parseLong(matcher.group())); // Add the value to the list
		}
		System.out.println(list);
		
	}*/
}
