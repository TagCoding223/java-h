import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j61_sumthreeno {
    static void sumThree(double a, double b, double c){
        System.out.println("Sum of a ,b & c is : "+(a+b+c));
    }
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter value for a : ");
        double x=user.nextDouble();
        System.out.print("Enter value for a : ");
        double y=user.nextDouble();
        System.out.print("Enter value for a : ");
        double z=user.nextDouble();
        sumThree(x, y, z);
        user.close();
    }
}
