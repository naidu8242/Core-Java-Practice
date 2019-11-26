package parties;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class MonthNames {
    public static void main(String[] args) {
            String date1 = "2018-04-01";
            String date2 = "2019-03-01";

            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("uuuu-MM-dd", Locale.ROOT);
            DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MMMM-uuuu", Locale.ROOT);
            YearMonth endMonth = YearMonth.parse(date2, dateFormatter);
            for (YearMonth month = YearMonth.parse(date1, dateFormatter);
                    ! month.isAfter(endMonth);
                    month = month.plusMonths(1)) {
                System.out.println(month.format(monthFormatter));
            }
    
           
      }
}