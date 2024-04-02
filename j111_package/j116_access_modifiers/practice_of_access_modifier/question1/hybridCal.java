package calculator;
import java.util.Scanner;
public class hybridCal {
    public float a;
    public float b;
    public Scanner user = new Scanner(System.in);

    public void sumOfTwoSquerValue() {
        System.out.print("Enter value of a : ");
        a = user.nextFloat();
        System.out.print("Enter value of b : ");
        b = user.nextFloat();
        System.out.println("Result of " + b + "² + " + a + "² is : " +( Math.pow(a, 2)+Math.pow(b,2))); // superscript(a)\u00bb
    }

    public void showSinAddCos() {
        System.out.print("Enter value of sin : ");
        a = user.nextFloat();
        System.out.print("Enter value of cos : ");
        b = user.nextFloat();
        System.out.println("Result of sin(" + a + ") + cos("+b+") is : " + (Math.sin(a)+Math.cos(b)));
    }
}
