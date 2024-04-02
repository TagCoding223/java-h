import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j47_factorial_loops {
    public static void main(String[] args) {
        //factoial using loops
        Scanner user=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=user.nextInt();
        user.close();
        int fac=1;
        int i=num;
        //using for loop
        // for(i;i>0;i--){
        //     fac=fac*i;
        // }

        //using do-while loop
        // do{
        //     fac=fac*i;
        //     i--;
        // }while(i>0);

        //using while loop
        while(i>0){
            fac=fac*i;
            i--;
        }
        System.out.println("Factorial of "+num+" is : "+fac);
    }
}
