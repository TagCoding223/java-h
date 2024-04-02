import java.util.Scanner;;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j69_sum_nnaturalno_byrecursion {
    static int sum(int num){
        if(num==0){
            return 0;
        }
        if(num==1){
            return 1;
        }
        return num+sum(num-1);
    }
    public static void main(String[] args) {
        //calculate sum of n natural numbers usin recursion
        Scanner user=new Scanner(System.in);
        System.out.print("Enter a value of n for natural no. : ");
        int limit=user.nextInt();
        user.close();
        System.out.println("Sum of first "+limit+" natural numbers is : "+sum(limit));
    }
}
