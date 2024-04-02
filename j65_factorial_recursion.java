import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j65_factorial_recursion {
    // using recursion
    static int recursion(int x){
        if(x==1 || x==0){
            return 1;
        }
        return x*recursion(x-1);
    }

    // using loop in method 
    static int recursion1(int x){
        int result=1;
        for(int i=x;i>0;i--){
            result=result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a=user.nextInt();
        user.close();

        // using recursion
        int result=recursion(a);
        System.out.println("Factorial of given number is : "+result);

        // using loop in method 
        int result1=recursion1(a+1);
        System.out.println("Factorial of given number+1 is : "+result1);
    }
}
