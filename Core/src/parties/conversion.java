package parties;
import java.math.BigDecimal;

public class conversion {
	public static void main(String[] args) {
		Double d = 5000000000.10;
		BigDecimal c = BigDecimal.valueOf(d);
		System.out.println(c);
//		 BigDecimal bd = new BigDecimal(23.086);
//	        BigDecimal bd1= new BigDecimal(0.000);    
//	        DecimalFormat df = new DecimalFormat("0.##");    
//	        System.out.println("bd value::"+ df.format(bd));
//	        System.out.println("bd1 value::"+ df.format(bd1));
	}
}
