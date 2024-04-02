import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j07_avg_5sub_byuser {
    public static void main(String[] args) {
        //averege of 5 subjects
        float a,b,c,d,e;
        Scanner user=new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        a=user.nextFloat();
        System.out.print("Enter number 2 : ");
        b=user.nextFloat();
        System.out.print("Enter number 3 : ");
        c=user.nextFloat();
        System.out.print("Enter number 4 : ");
        d=user.nextFloat();
        System.out.print("Enter number 5 : ");
        e=user.nextFloat();
        float avg=(a+b+c+d+e)/5;
        System.out.println("Averger of given 5 subjects marks is : "+avg);
        user.close();
    }
}
