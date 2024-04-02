import java.util.Scanner;
/**
 * @Title exception class intro
 * @author V.C22.3
 * @version 0.1
 */
class myExcep extends Exception{
    @Override
    public String toString(){
        return super.toString()+"I am toString() Method !";
    }
    @Override
    public String getMessage(){
        // return super.getMessage()+"I am getMessage() Method !";
        return "I am getMessage() Method !";
    }
}
public class j123_exception_class_intro {
    public static void main(String[] args) {
        int a;
        Scanner user=new Scanner(System.in);
        a=user.nextInt();
        if(a<9){
            try {
                // throw new myExcep(); // the throw keyword is used to throw an exception explactly by the programmer(THROW ko try-catch me ragna jarure he , nahi to error )
                throw new ArithmeticException("This is an arithmetic exception !");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace(); // display -> at j123_exception_class_intro.main(j123_exception_class_intro.java:18)
                System.out.println("The End !");
            }
        }
        user.close();
    }
}
