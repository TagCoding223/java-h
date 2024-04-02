/**
 * @author V.C22.3
 * @version 0.1
 */
public class j35_leap {
    public static void main(String[] args) {
        // leap year 
        java.util.Scanner user=new java.util.Scanner(System.in);
        System.out.print("Enter a year : ");
        int year=user.nextInt();
        if((year%2==0 && year%4==0) ||(year%200==0 || year%400==0)){
            System.out.println("Given year is a leap year .");
        }
        else{
            System.out.println("Given year is not a leap year .");            
        }
        user.close();
    }
}
