import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class j136_gregorian_calendar {
    public static void main(String[] args) {
        Calendar objCalendar=Calendar.getInstance();
        System.out.println(objCalendar.getTime());
        System.out.println(objCalendar.get(Calendar.DATE));
        System.out.println(objCalendar.get(Calendar.SECOND));
        System.out.println(objCalendar.get(Calendar.HOUR));
        System.out.println(objCalendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(objCalendar.get(Calendar.YEAR));
        System.out.println(objCalendar.get(Calendar.MONTH));
        System.out.println(objCalendar.get(Calendar.MINUTE));

        System.out.println(objCalendar.get(Calendar.HOUR_OF_DAY)+" : "+objCalendar.get(Calendar.MINUTE)+" : "+objCalendar.get(Calendar.SECOND)+" : "+objCalendar.get(Calendar.MILLISECOND));

        GregorianCalendar objCalendar2=new GregorianCalendar();
        System.out.println(objCalendar2.isLeapYear(2012));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getDefault());// get the default time zone
        System.out.println(TimeZone.getDefault().getID());// get the default time zone id

    }
}
