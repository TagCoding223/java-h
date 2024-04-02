import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j29_character_ascii {
    public static void main(String[] String) {
        //print character ascii value
        Scanner user=new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch=user.next().charAt(0);
        int a=ch;
        System.out.println("M1 : character vaule of "+ch+" is : "+a);
        System.out.println("M2 : character vaule of "+ch+" is : "+(int)ch);
        user.close();
    }
}
