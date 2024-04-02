package calculator;
import java.util.Scanner;
public class sciCal {
    public float a;
    public float b;
    public Scanner user=new Scanner(System.in);
    public void showPower(){
        System.out.print("Enter value : ");
        a=user.nextFloat();
        System.out.print("Enter his power : ");
        b=user.nextFloat();
        System.out.println("Result of "+b+" power of "+a+" is : "+Math.pow(a,b)); // superscript(a)\u00bb
    }
    public void showInSin(){
        System.out.print("Enter value : ");
        a=user.nextFloat();
        System.out.println("Result of sin("+a+") is : "+Math.sin(a));
    }
    public void showInCos(){
        System.out.print("Enter value : ");
        a=user.nextFloat();
        System.out.println("Result of cos("+a+") is : "+Math.cos(a));
    }
    
}
