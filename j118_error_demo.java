import java.util.Scanner;

/** 
 * @Title error demo
 * @author V.C22.3
 * @version 0.1
*/
public class j118_error_demo {
    public static void main(String[] args) {
        // syntax error
        // Int a=0;
        // int 1a=9;

        // logical error 1
        // System.out.println(2);
        // for(int i=1;i<5;i++){
        //     System.out.println(2*i+1);
        // }
        // // logical error 2 print 1 to 5
        // for(int i=1;i<5;i++){
        //     System.out.println(i);
        // }

        // // runtime(exception) error 1
        // Scanner user=new Scanner(System.in);
        // int a;
        // System.out.print("Enter a integer : ");
        // a=user.nextInt();
        // System.out.println("a divide by 2 is : "+(a/2)); // spoure user enter non integer value then it is a exception (like a character ,float etc)
        
        // runtime(exception) error 2
        Scanner user=new Scanner(System.in);
        int a;
        System.out.print("which number is best for divison of 5 : ");
        a=user.nextInt();
        System.out.println("a divide by 2 is : "+(5/a)); // spoure user enter zero(Exception in thread "main" java.lang.ArithmeticException: / by zero
        )
    }
}
