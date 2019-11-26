package parties;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
  public static void main(String[] argv) throws Exception {

    Format formatter = new SimpleDateFormat("MMMM"); 
    String s = formatter.format(new Date());
    System.out.println(s);
  }
}
