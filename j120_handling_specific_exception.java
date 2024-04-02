import java.util.Scanner;
/** 
 * @Title handling specific exception
 * @author V.C22.3
 * @version 0.1
*/
public class j120_handling_specific_exception {
    public static void main(String[] args) {
        int []arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        Scanner user=new Scanner(System.in);
        System.out.print("Enter array index : ");
        int index=user.nextInt();
        System.out.print("Enter the number you want to divide the value with : ");
        int number=user.nextInt();
        try{
            System.out.println("The value at array index entered is : "+arr[index]);
            System.out.println("The value of array value/number is : "+(arr[index]/number));
        }
        // catch(Exception e){ // use when we have no idea which excetion will be occur (when different exception occur on different inputs)
        //     System.out.println("Some error occur !");
        //     System.out.println(e);
        // }
        // catch(ArithmeticException e){ // use when we know that arthmetic exception occur in program
        //     System.out.println("Some error occur !");
        //     System.out.println(e);
        // }
        catch(ArrayIndexOutOfBoundsException e){ // use when we know that ArrayIndexOutOfBounds exception occur in program
            System.out.println("Some error occur !");
            System.out.println(e);
        }
        user.close();
    }
}
// only one catch allow