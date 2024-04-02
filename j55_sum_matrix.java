import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j55_sum_matrix {
    // sum of tow matrix of 2X3
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int [][] arrMatrix1=new int[2][3];
        int [][] arrMatrix2=new int[2][3];
        int [][] arrMatrix3=new int[2][3];
        System.out.println("Enter values for matrix 1,");
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print("Enter value in matrix1 at ["+i+"]["+k+"] : ");
                arrMatrix1[i][k]=user.nextInt();
            }
        }
        System.out.println("Enter values for matrix 2,");
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print("Enter value in matrix2 at ["+i+"]["+k+"] : ");
                arrMatrix2[i][k]=user.nextInt();
                arrMatrix3[i][k]=arrMatrix1[i][k]+arrMatrix2[i][k];
            }
        }
        System.out.println("Sum of given two matrix is ,\n");
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print("\t"+arrMatrix3[i][k]);
            }
            System.out.println();
        }
        user.close();
    }
}
