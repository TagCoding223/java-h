import java.util.Calendar;
/**
 * @Title running clock
 * @author V.C22.3
 * @version 0.1
 */
public class j137_clock {
    public static void main(String[] args) {
        int i = 0;
        while (i < 25) {
            try {
                Calendar obCalendar = Calendar.getInstance();
                System.out.println(obCalendar.get(Calendar.HOUR_OF_DAY) + " : " + obCalendar.get(Calendar.MINUTE)
                        + " : " + obCalendar.get(Calendar.SECOND));
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }// you should try clear screen command 
}
