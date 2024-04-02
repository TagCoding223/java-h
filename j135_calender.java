import java.util.Calendar;//is an abstract class
import java.util.TimeZone;
/**
 * @Title calendar class intro
 * @author V.C22.3
 * @version 0.1
 */
public class j135_calender {
    public static void main(String[] args) {
        // Calendar objCalendar=Calendar.getInstance();
        Calendar objCalendar=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(objCalendar.getCalendarType());
        System.out.println(objCalendar.getTimeZone());
        System.out.println(objCalendar.getTimeZone().getID());
    }
}
