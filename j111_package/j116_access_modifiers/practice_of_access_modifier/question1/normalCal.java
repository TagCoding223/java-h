package calculator;
import java.util.Scanner;

public class normalCal{
    public float a;
    public float b;
    public Scanner user=new Scanner(System.in);
    public normalCal(){
        System.out.print("Enter value of a : ");
        a=user.nextFloat();
        System.out.print("Enter value of b : ");
        b=user.nextFloat();
    }
    public void showAdd(){
        System.out.println("Sum of "+a+" and "+b+" is : "+(a+b));
    }
    public void showSubtraction(){
        System.out.println("Subtraction of "+a+" and "+b+" is : "+(a-b));
    }
    public void showMultiplication(){
        System.out.println("Multiplication of "+a+" and "+b+" is : "+(a*b));
    }
    public void showDivison(){
        System.out.println("Divison of "+a+" and "+b+" is : "+(a/b));
    }
}