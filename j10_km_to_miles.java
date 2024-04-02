import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j10_km_to_miles {
    public static void main(String[] args) {
        //km to miles conversion
        Scanner user=new Scanner(System.in);
        System.out.print("Enter distance in kilometer : ");
        double km=user.nextDouble();
        double miles=km*(0.621371);
        System.out.println("Given distance in kilometer convert in miles is : "+miles);
        user.close();
    }
}
