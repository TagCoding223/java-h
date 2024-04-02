/**
 * @author V.C22.3
 * @version 0.1
 */
public class j56_reverse_array_matrix {
    public static void main(String[] args) {
        
        // reverse an array
        // int []arr={45,89,29,47,91,1,3};
        // int size=arr.length-1;
        // System.out.println("Reverse order of arr,");
        // for(int i:arr){
        //     System.out.print(arr[size]+"\t");
        //     size--;
        // }

        // reverse a matrix of 2X3
        int [][] arrMatrix1={{1,2,3},{4,5,6}};
        for (int i = 1; i >=0 ; i--) {
            for (int j = 2; j >=0; j--) {
                System.out.print(arrMatrix1[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
