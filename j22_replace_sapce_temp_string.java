import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j22_replace_sapce_temp_string {
    public static void main(String[] args) {
        //replace string space to undercoer
        Scanner user=new Scanner(System.in);
        String str="Hello guys i am vishal";
        str=str.replace(' ','_');
        System.out.println(str);

        // replace letter template
        String name;
        String letter="Dear <|name|> , Thanks a lot ";
        System.out.print("Enter your name : ");
        name=user.nextLine();
        letter=letter.replace("<|name|>", name);
        System.out.println(letter);
        user.close();
    }
}
