import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j51_multi_array {
    public static void main(String[] args) {
        // multi dimention array
        Scanner user = new Scanner(System.in);
        // 2D array
        // int[][] arr = new int[2][2];

        // 3D array
        String[][][] strArr = new String[2][2][2];
        // for each loop does not work on multi dimention array (note : you need more
        // research on this topic)
        // int j = 0;
        // int k = 0;
        // for (int i : arr) {
        //     for (int y : arr) {
        //         System.out.print("Element " + (j + 1) + " : ");
        //         arr[j][k] = user.nextInt();
        //         j++;
        //     }
        //     k++;
        // }

        // intiailzation and display integer 2D array
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         System.out.print("Enter element [" + i + "][" + j + "] : ");
        //         arr[i][j] = user.nextInt();
        //     }
        // }

        // System.out.println("You enter that,");
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         System.out.println("Element [" + i + "][" + j + "] is : " + arr[i][j]);
        //     }
        // }

        // intiailzation and display string 3D array
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr.length; j++) {
                for (int k = 0; k < strArr.length; k++) {
                    System.out.print("Enter element [" + i + "][" + j + "][" + k + "] : ");
                    strArr[i][j][k] = user.next();
                }
            }
        }

        System.out.println("You enter that,");
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr.length; j++) {
                for (int k = 0; k < strArr.length; k++) {
                    System.out.print(strArr[i][j][k] + " ");
                }
            }
        }
        user.close();
    }
}
