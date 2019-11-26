package parties;
import java.util.regex.Pattern;

public class Test2 {
	public static void main(String[] args) {
		String orgName = "Sjhsgdhgshdfg.docx";
		String[] splitName = orgName.split(Pattern.quote("."));
		System.out.println(splitName[1]);
		int count = 0;
		StringBuilder sb = new StringBuilder();
		String finalString ="";
		switch (splitName.length) {
		  case 1:
				  switch( orgName.length() )
		                {
		                    case 2:
		            			for (int j = 0; j < orgName.length(); j++) {
		            				orgName.charAt(j);
		            				count++;
		            			}
		            			sb.append(orgName.substring(0, count));
		            			finalString = sb.toString().toUpperCase();
		                        break;
		                    default:
		            			sb.append(orgName.substring(0, 3));
		            			 finalString = sb.toString().toUpperCase();
		                }
		        break;
		  case 2: 
				String first = splitName[0].substring(0, 2);
				String second = splitName[1].substring(0, 1);
				 finalString = sb.append(first).append(second).toString().toUpperCase();
		        break;
		  default:
				for (String s : orgName.split(" ")) {
					sb.append(s.charAt(0));
				}
				 finalString = sb.toString().substring(0, 3).toUpperCase();
		        break;
		}
		System.out.println(finalString);
		
		
		
		
		/*int count = 0;
		if (splitName.length == 1 && orgName.length() <= 2) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < orgName.length(); j++) {
				orgName.charAt(j);
				count++;
			}
			sb.append(orgName.substring(0, count));
			System.out.println(sb.toString().toUpperCase());
		}
		if (splitName.length == 1 && orgName.length() > 2) {
			StringBuilder sb = new StringBuilder();
			sb.append(orgName.substring(0, 3));
			String finalString = sb.toString().toUpperCase();
			System.out.println(finalString);
		} else if (splitName.length == 2 && (splitName[1].length() == 1)) {
			StringBuilder sb = new StringBuilder();
			String first = splitName[0].substring(0, 2);
			String second = splitName[1];
			String finalString = sb.append(first).append(second).toString().toUpperCase();
			System.out.println(finalString);
		} else if (splitName.length == 2) {
			if (!Character.isWhitespace(splitName[1].charAt(1))) {
				StringBuilder sb = new StringBuilder();
				String first = splitName[0].substring(0, 2);
				String second = splitName[1].substring(0, 1);
				String finalString = sb.append(first).append(second).toString().toUpperCase();
				System.out.println(finalString);
			}
		} else if (splitName.length >= 3) {
			StringBuilder sb = new StringBuilder();
			for (String s : orgName.split(" ")) {
				sb.append(s.charAt(0));
			}
			String finalString = sb.toString().substring(0, 3).toUpperCase();
			System.out.println(finalString);
		}*/
	}
}