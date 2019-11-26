package parties;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*import java.util.*;
import java.text.*;

public class DateConversion {
	public static void main(String[] args) throws Exception {
		  String str_date="11-20-18";
		 DateFormat formatter ; 
		 Date date ; 
		  formatter = new SimpleDateFormat("dd-MM-yy");
		  date = (Date)formatter.parse(str_date);  
		 System.out.println("Today is " +date );
	}
}
*/

public class DateConversion {
 
 public static void main(String[] args) throws ParseException {
 
	 Date currentDate = new Date();
	 System.out.println(currentDate);
	 SimpleDateFormat sdf  = new SimpleDateFormat("dd-MM-yy");
	 Date date1 = sdf.parse("07-09-2018");
	 if(date1.before(currentDate)) {
		 System.out.println("Before Time");
	 }else {
		 System.out.println("not matcing");
	 }
	 
	 
 }
 
}