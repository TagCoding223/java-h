/**
 * @Title date time intro
 * @author V.C22.3
 * @version 0.1
 */
public class j133_date_time_intro {
    public static void main(String[] args) {
        // java hold date in miliseconds and java assumes that 1900 is the start year 
        // miliseconds because lowest unit means higest accuarasy
        // pure milisecond time
        System.out.println(System.currentTimeMillis()); // all time gone from 1 jan 1970 is in miliseconds
        // convert from miliseconds 
        System.out.println(System.currentTimeMillis()/1000/3600/24/365); // years from 1970
        System.out.println(System.currentTimeMillis()/1000/3600/24); // days from 1970
        System.out.println(System.currentTimeMillis()/1000/3600); // hours from 1970
        System.out.println(+System.currentTimeMillis()/1000/60); // mintues from 1970
        System.out.println(System.currentTimeMillis()/1000); // second from 1970
    
        System.out.println("Long capacity : "+Long.MAX_VALUE);
    }
}
