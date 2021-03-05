package utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    public static String getTodayDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM_dd_yyyy_HHMMss");
        LocalDateTime now = LocalDateTime.now();
       return dtf.format(now);
    }


}
