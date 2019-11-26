package parties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Time24hFormatValidator{
 
	private Pattern pattern;
	  private Matcher matcher;

	  private static final String TIME12HOURS_PATTERN = "([01]?[0-9]|2[0-3]):[0-5][0-9]";

	  public Time24hFormatValidator(){
		  pattern = Pattern.compile(TIME12HOURS_PATTERN);
	  }

	 
	  public boolean validate(final String time){		  
		  matcher = pattern.matcher(time);
		  return matcher.matches();	    	    
	  }
	  
	  public static void main(String[] args) {
		  Time24hFormatValidator time24hFormatValidator = new Time24hFormatValidator();
	      /*  String time = "3.45";
	        int hours = 0;
	        int mins = 0;
	        if (time.contains(":")) {
	            hours = Integer.parseInt(time.split(":")[0]);
	            mins = Integer.parseInt(time.split(":")[1]);
	        }else if (time.contains(".")) {
	            hours = Integer.parseInt(time.split("[.]")[0]);
	            mins = Integer.parseInt(time.split("[.]")[1]);
	        }else {
	            hours = Integer.parseInt(time);
	        }
	        String finalTime = (hours < 10 ? "0" + hours : hours) + ":" + (mins < 10 ? "0" + mins : mins);
	        boolean result = time24hFormatValidator.validate(finalTime);
	        System.out.println("TIME : " + finalTime);
	        System.out.println("result  "+result);*/
	    }
	  
	/*  public static void main(String[] args) {
		  
		  Time24hFormatValidator time24hFormatValidator = new Time24hFormatValidator();
		  String time = "05:00";
		  
		  String mins = time.split(":")[0],secs = "";
		  
		  
		  boolean result = time24hFormatValidator.validate(time);
		  System.out.println("Result : "+result);
	}*/
}