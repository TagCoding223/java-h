import java.util.Scanner;

/**
 * @Title check wrong index
 * @author V.C22.3
 * @version 0.1
 */
public class j122_wrong_index_identification {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        Scanner user = new Scanner(System.in);
        boolean flag = true;
        while (true) {
            if (flag) {
                System.out.print("Enter array index : ");
                int index = user.nextInt();
                try {
                    System.out.println("The value at array index entered is : " + arr[index]);
                    flag=false;
                    try {
                        System.out.print("Enter the number you want to divide the value with : ");
                        int number = user.nextInt();
                        System.out.println("The value of array value/number is : " + (arr[index] / number));
                        user.close();
                    } 
                    catch (ArithmeticException e) {
                        System.out.println("Error : " + e);
                    }
                } 
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Re-enter , because error occur : "+e);
                }
            }
            else{
                break;
            }
        }
    }
}
