import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j08_cgpa_3sub_byuser {
    public static void main(String[] args) {
        //cgpa of 3 subjects
        float a,b,c;
        Scanner user=new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        a=user.nextFloat();
        System.out.print("Enter number 2 : ");
        b=user.nextFloat();
        System.out.print("Enter number 3 : ");
        c=user.nextFloat();
        user.close();
        float cgpa=(a+b+c)/30;
        System.out.println("CGPA of given marks of 3 subjects is : "+cgpa);
    }
}
