import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j17_equation_operation {
    public static void main(String[] args) {
        // equation solution operation for operator preceandece & assoceavetiy 
        float a,b,c;
        Scanner user=new Scanner(System.in);
        System.out.print("Enter value 1 : ");
        a=user.nextFloat();
        System.out.print("Enter value 2 : ");
        b=user.nextFloat();
        System.out.print("Enter value 3 : ");
        c=user.nextFloat();
        float re=(b*b-c*c)/(2*a*5);
        System.out.println("result is : "+re);
        user.close();

        int x=7*49/7+35/7;
        System.out.println("the value of x is : "+x);
    }
}
