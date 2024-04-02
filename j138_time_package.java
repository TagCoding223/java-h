import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/**
 * @Title local date time in time package
 * @author V.C22.3
 * @version 0.1
 */
public class j138_time_package {
    public static void main(String[] args) {
        // java.time package avaliable from java 8 onwords , capable of storing even nano seconds
        // commonly used classes in here
        LocalDate objDate=LocalDate.now();
        System.out.println(objDate);
        LocalTime objTime=LocalTime.now();
        System.out.println(objTime);
        LocalDateTime objDateTime =LocalDateTime.now();
        System.out.println(objDateTime);



        // DateTimeFormatter oDateTimeFormatter=DateTimeFormatter.BASIC_ISO_DATE;
        DateTimeFormatter oDateTimeFormatter=DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        System.out.println(oDateTimeFormatter);
        // String text=objDateTime.format(oDateTimeFormatter);
        // LocalDateTime pDateTime=LocalDateTime.parse(text, oDateTimeFormatter);
        // System.out.println(pDateTime); you need work on them
        // System.out.println(objDateTime.format(oDateTimeFormatter));
    }
}
