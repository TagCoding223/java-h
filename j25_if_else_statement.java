import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j25_if_else_statement {
    public static void main(String[] args) {
        //if-else statement
        Scanner user=new Scanner(System.in);
        int age;
        System.out.print("Enter your age : ");
        age=user.nextInt();
        if(age>18){
            System.out.println("You can drive.");
        }
        else{//else block is optional(try to comment it)
            System.out.println("You can't drive yet , kid.");
        }
        user.close();
    }
}
