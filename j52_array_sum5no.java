import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j52_array_sum5no {
    // sum of float array 5 values
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        float[] arr = new float[5];
        
        //System.out.println(arr.length); arr.length=last index+1;
        int j = 0;
        float sum=0;
        for (float i : arr) {
            System.out.print("Element " + (j + 1) + " : ");
            arr[j] = user.nextFloat();
            sum=sum+arr[j];
            j++; 
        }
        System.out.print("Sum of given five float values is : "+sum);
        user.close();
    }
}
