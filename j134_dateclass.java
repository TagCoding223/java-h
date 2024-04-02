import java.util.Date;

/**
 * @Title date class intro
 * @author V.C22.3
 * @version 0.1
 */
public class j134_dateclass {
    public static void main(String[] args) {
        Date objDate=new Date();
        System.out.println(objDate);
        System.out.println(objDate.getTime());
        System.out.println(objDate.getDate());
        System.out.println(objDate.getDay());
        System.out.println(objDate.getHours());
        System.out.println(objDate.getMinutes());
        System.out.println(objDate.getSeconds());
        System.out.println(objDate.getYear());
        System.out.println(objDate.getMonth());
        System.out.println(objDate.getTimezoneOffset());


    }
}
