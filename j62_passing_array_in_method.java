import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j62_passing_array_in_method {
    static void arrMethod(int [] arrReferance) {
        for (int j = 0; j < arrReferance.length; j++) {
            arrReferance[j]=arrReferance[j] + 1;
        }
    }
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int []arr=new int [5];
        for (int i = 0; i < arr.length; i++) {
             System.out.print("Enter element "+(i+1)+" : ");
            arr[i]=user.nextInt();
        }
        arrMethod(arr);
        System.out.println("After , calling arrMethod ,");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t"+arr[i]);
        }
        user.close();
    }
}
// if we pass preemetive data as arguments then a copy send to method , but when we send non-preemetive data as arguments then a referance share with method there array name arr is an refrence of a memory block where array elements save(means arr point to first index of array)