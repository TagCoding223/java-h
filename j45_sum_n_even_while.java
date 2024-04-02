import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j45_sum_n_even_while {
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        System.out.print("Enter a limit for first even numbers for there sum : ");
        int num=user.nextInt();
        int sum=0;
        int i=0,counter=-1;
        
        
        // by using while loop
        // boolean flag=true;
        // while(flag){ 
        //     if(num==counter){
        //         flag=false;
        //     }
        //     else if(i%2==0){
        //         sum=sum+i;
        //         counter++;
        //     }
        //     i++;
        // }

        //by using for loop
        for(boolean flag=true;flag;i++){
            if(num==counter){
                flag=false;
            }
            else if(i%2==0){
                sum=sum+i;
                counter++;
            }
        }
        System.out.println("sum of first "+num+" even numbers is : "+sum);
        user.close();
    }
}
