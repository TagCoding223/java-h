import java.util.Scanner;;
/**
 * @author V.C22.3
 * @version 0.1
 */
// sum of first n natural numbers iterative apporach
public class j75_sum_nnatural_iterativ_approch {
    static int sum(int num){
        int pass=0;
        for (int i = num; i >0 ; i--) {
            pass=pass+i;
        }
        return pass;
    }
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        System.out.print("Enter a value of n for natural no. : ");
        int limit=user.nextInt();
        user.close();
        System.out.println("Sum of first "+limit+" natural numbers is : "+sum(limit));
    }
}
