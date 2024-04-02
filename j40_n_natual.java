import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j40_n_natual {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a limit when you print natural no. : ");
        int num=user.nextInt();
        System.out.println("Natural number upto "+num);
        int i =0;
        do{
            System.out.println(i);
            i++;
        }while(i<=num); 
        user.close(); 
    }
}
