import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j16_byuser_less_100 {
    public static void main(String[] args) {
        // given value is less than 100
        Scanner user=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a=user.nextInt();
        System.out.println(a<100);
        user.close();
    }
}
