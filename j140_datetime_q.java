import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @Title time q
 * @author V.C22.3
 * @version 0.1
 */

public class j140_datetime_q {
    public static void main(String[] args) {
        Date objDate=new Date();
        System.out.println("Current Time is : "+objDate.getHours()+" : "+objDate.getMinutes()+" : "+objDate.getSeconds());

        Calendar obCalendar=Calendar.getInstance();
        System.out.println("Current Time is : "+obCalendar.getTime());
        System.out.println("Current Time is : "+(obCalendar.get(Calendar.HOUR_OF_DAY))+" : "+obCalendar.get(Calendar.MINUTE)+" : "+obCalendar.get(Calendar.SECOND));

        LocalTime oLocalTime=LocalTime.now();
        System.out.println("Current Time is : "+oLocalTime);
        
    }
}
