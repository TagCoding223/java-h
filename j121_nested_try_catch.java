import java.util.Scanner;
/** 
 * @Title nested try catch
 * @author V.C22.3
 * @version 0.1
*/
public class j121_nested_try_catch {
    public static void main(String[] args) {
        int []arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        Scanner user=new Scanner(System.in);
        System.out.print("Enter array index : ");
        int index=user.nextInt();
        try{
            System.out.println("The value at array index entered is : "+arr[index]);
            try{
                System.out.print("Enter the number you want to divide the value with : ");
                int number=user.nextInt();
                System.out.println("The value of array value/number is : "+(arr[index]/number));
            }
            catch(ArithmeticException e){
                System.out.println("Error : "+e);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error : "+e);
        }
        user.close();
    }
}
