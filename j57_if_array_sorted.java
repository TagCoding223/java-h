import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j57_if_array_sorted {
    public static void main(String[] args) {
        // int []arr={12,52,445,45,1078,65,4,68,43,452,711,555,36,47,9};
        //int[] arr = {9,8,7,6,5,4,3,2};
        // this is normal case sorting (task for you assume accendig and deccendin order)
        int []arr=new int[5];
        Scanner user=new Scanner(System.in);
        System.out.println("Enter array elements ,");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element"+(i+1)+" : ");
            arr[i]=user.nextInt();
        }
        user.close();
        boolean flag = false;

        //accending order case
        if (arr[0] < arr[1]) {
            for (int j = 0; j < arr.length; j++) {
                if (j < arr.length - 1) {
                    if (arr[j] < arr[j + 1]) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
        } 
        //decending order case
        else {
            for (int j = 0; j < arr.length; j++) {
                if (j < arr.length - 1) {
                    if (arr[j] > arr[j + 1]) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
        }
        if (flag == true) {
            System.out.println("Array is sorted!");
        } else {
            System.out.println("Array is not sorted!");
        }
    }
}
// you should inprove this algorithm