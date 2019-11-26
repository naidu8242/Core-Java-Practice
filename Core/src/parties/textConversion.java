package parties;

public class textConversion {
	public static void main(String[] args) {
		 //  Set the HTML:
	    String html;
	    html = "<ul itemprop=\"description\" class=\"listing mt10 wb\" style=\"margin-bottom: 0px; font-family: Roboto, sans-serif; list-style: none; word-break: break-word; font-size: 13px; line-height: 18px; color: rgb(102, 102, 102);\"><div style=\"font-size: 12px;\"><b><u>Skills and Qualifications Required</u>&nbsp;-</b></div><div style=\"font-size: 12px;\"><ul style=\"margin-left: 20px; list-style: none;\"><li style=\"font-size: 13px; line-height: 20px; list-style: disc;\">Bachelors degree in computer science or related field required; masters degree is a plus</li><li style=\"font-size: 13px; line-height: 20px; list-style: disc;\">Experience in development and maintenance of J2SE, J2EE, Spring, Hibernate,&nbsp;<font class=\"hlite\" style=\"font-weight: 700;\">Javas</font>cript and SQL / PLSQL.&nbsp;</li><li style=\"font-size: 13px; line-height: 20px; list-style: disc;\">Writing quality code in an Object Oriented language like&nbsp;<font class=\"hlite\" style=\"font-weight: 700;\">Java</font></li><li style=\"font-size: 13px; line-height: 20px; list-style: disc;\">Sound knowledge of OOPs concepts, Algorithms and Design Patterns</li><li style=\"font-size: 13px; line-height: 20px; list-style: disc;\">Experience in Open GL /&nbsp;<font class=\"hlite\" style=\"font-weight: 700;\">Java</font>&nbsp;3D, jQuery, Spring MVC and Object Oriented&nbsp;<font class=\"hlite\" style=\"font-weight: 700;\">Javas</font>cript would be an added advantage</li><li style=\"font-size: 13px; line-height: 20px; list-style: disc;\">Strong problem solving and analytical capabilities</li><li style=\"font-size: 13px; line-height: 20px; list-style: disc;\">Fast learner, flexible and able to work well in a challenging environment</li><li style=\"font-size: 13px; line-height: 20px; list-style: disc;\">Good knowledge of Core&nbsp;<font class=\"hlite\" style=\"font-weight: 700;\">Java</font>&nbsp;concepts</li><li style=\"font-size: 13px; line-height: 20px; list-style: disc;\">Self-starter with commitment to professional growth</li></ul></div></ul>";
		 /*String x = html.replaceAll("<font(.*?);\">", " ");
		 String y = x.replaceAll("</font>", "");*/
		 
		 String b = html.replaceAll("<font(.*?);\">", " ").replaceAll("</font>", "").replaceAll("(?s)<[^>]*>(\\s*<[^>]*>)*", "\n").replaceAll("&nbsp;", "");
	    //String strippedText = y.replaceAll("(?s)<[^>]*>(\\s*<[^>]*>)*","\n");

		 System.out.println(b);
	}
}
