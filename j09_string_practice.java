import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j09_string_practice {
    public static void main(String[] args) {
        String name;
        Scanner user=new Scanner(System.in);
        System.out.print("Enter your name : ");
        name=user.nextLine();
        System.out.println("hello "+name+", good morning");
        user.close();
    }
}
