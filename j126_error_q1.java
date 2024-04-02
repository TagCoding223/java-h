import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @Title error q1
 * @author V.C22.3
 * @version 0.1
 */
public class j126_error_q1{
    public static void main(String[] args) throws InterruptedException{
        Scanner user=new Scanner(System.in);
        
        try{
            System.out.print("Enter a : ");
            int a=user.nextInt();
            System.out.print("Enter b : ");
            int b=user.nextInt();
            // Thread.sleep(-400); throw illegal argument exception
            Thread.sleep(400); // when we use them ,we need to incrroet that (throws InterruptedException)
            try{
                System.out.println("a/b is : "+(a/b));
            }    
            catch(ArithmeticException e){
                // pass 0 occur that
                System.out.println(e);
            }
        }
        catch(IllegalArgumentException e){
            // time is negative then occur that
            System.out.println("work");
            System.out.println(e);
        }
        catch(InputMismatchException e){
            // given is mismatch from data type then occur that 
            System.out.println(e);
        }
        user.close();
    }
}
