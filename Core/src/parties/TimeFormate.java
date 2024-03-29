package parties;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 

public class TimeFormate{
	
	  private Pattern pattern;
	  private Matcher matcher;
 
	  private static final String TIME24HOURS_PATTERN =  "([01]?[0-9]|2[0-3]):[0-5][0-9]";
	  
	  public TimeFormate(){
		  pattern = Pattern.compile(TIME24HOURS_PATTERN);
	  }
	  
	  public boolean validate(final String time){
		  
		  matcher = pattern.matcher(time);
		  return matcher.matches();
	    	    
	  }
} 
