import java.util.Scanner;
@SuppressWarnings("deprection") //there its not show any effect 
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j50_foreach_loop {
    @Deprecated //there its not show any effect 
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Enter array elements,");
        // for (int i = 0; i < 4; i++) {
        //     System.out.print("Element " + (i + 1) + " : ");
        //     arr[i] = user.nextInt();
        // }

        //taking array elements using for each loop
        int j=0;// we use j not use i , because when we use i only last value intiail , because i always 0 after each time
        for(int i : arr){ //here i just show a warning , so ignore it
             //if(j<6){ // here we does not need if statement , but we use for a additional safety
             System.out.print("Element " + (j + 1) + " : ");
             arr[j] = user.nextInt();
             j++;
            //}
        }
        user.close();
        System.out.println("You enter that,");
        for ( int i : arr) {
            System.out.println(i);
        }
    }
}
