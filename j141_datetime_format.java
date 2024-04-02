import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @Title date time format
 * @author V.C22.3
 * @version 0.1
 */
public class j141_datetime_format {
    public static void main(String[] args) {
        LocalDate oDate=LocalDate.now();
        System.out.println(oDate);

        DateTimeFormatter oDateFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter oDateTimeFormatter=DateTimeFormatter.ISO_ZONED_DATE_TIME;

        String myDate=oDateFormatter.format(oDate);
        System.out.println(myDate);

        String myDate2=oDateTimeFormatter.format(oDate);
        System.out.println(myDate2);
    }
}
