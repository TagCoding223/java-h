import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j74_convet_cel_to_fahren {
    static void celsiusToFahreheit(float a){
        float fahreheit=(a*9)/5+32;
        System.out.println("Temperature in Fahreheit is : "+fahreheit);
    }
    public static void main(String[] args) {
        // convert celsius to fehreheit using methods
        Scanner user=new Scanner(System.in);
        System.out.print("Enter temperature in celsius : ");
        float celsius=user.nextFloat();
        user.close();
        celsiusToFahreheit(celsius);
    }
}
