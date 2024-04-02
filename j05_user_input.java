import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j05_user_input {
    //user input by keyborad
    public static void main(String[] args) {
        //user inputs
        Scanner user=new Scanner(System.in);
        System.out.println("Enter your complete name");
        String e=user.nextLine();
        System.out.println("Enter a integer value");
        int a=user.nextInt();
        System.out.println("Enter a float value");
        float b=user.nextFloat();
        System.out.println("Enter a character");
        String c=user.next();
        System.out.println("Enter your first name");
        String d=user.next();
        //if we use nextLine() here that cannout read anything because previous enter are recored by them
        user.close();
        System.out.println("\ninteger value is : "+a);
        System.out.println("float value is : "+b);
        System.out.println("character is : "+c);
        System.out.println("your first name is : "+d);
        System.out.println("your complete name is : "+e);
    }
}
