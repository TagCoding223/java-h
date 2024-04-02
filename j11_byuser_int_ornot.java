import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j11_byuser_int_ornot {
    public static void main(String[] args) {
        //given number is integer or not
        Scanner user=new Scanner(System.in);
        System.out.print("Enter a integer value : ");
        boolean b=user.hasNextInt();
        if(b==true){
            System.out.println("given value is a integer");
        }
        else{
            System.out.println("given value is not a integer");
        }
        user.close();
    }
}
