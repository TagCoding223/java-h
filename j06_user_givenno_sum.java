import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j06_user_givenno_sum {
    public static void main(String[] args) {
        //sum of three user given numbers
        int a,b,c;
        Scanner user=new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        a=user.nextInt();
        System.out.print("Enter number 2 : ");
        b=user.nextInt();
        System.out.print("Enter number 3 : ");
        c=user.nextInt();
        user.close();
        int sum=a+b+c;
        System.out.print("sum of given numbers is : "+sum);
    }
}
