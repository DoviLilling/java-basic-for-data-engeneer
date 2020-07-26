package doviHW.com.hw20200726;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class mainDateFormat {
    public static void main(String[] args) {
        DoviDateConvertUtil df = new DoviDateConvertUtil();
        LocalDate dt1 = df.convert("26/07/2020", DateFormat.EU_DATE);
        LocalDate dt2 = df.convert("07/26/2020", DateFormat.US_DATE);
        System.out.println(dt1.equals(dt2));
        System.out.println(dt1);
        System.out.println(df.convert(dt1, DateFormat.US_DATE));
        LocalDateTime dtt1 = df.convert("26/07/2020 23:45:52", DateTimeFormat.EU_DATETIME);
        LocalDateTime dtt2 = df.convert("07/26/2020 11:45:52 PM", DateTimeFormat.US_DATETIME);
        System.out.println(dtt1.equals(dtt2));
        System.out.println(dtt1);
        System.out.println(df.convert(dtt1, DateTimeFormat.US_DATETIME));
    }
}
