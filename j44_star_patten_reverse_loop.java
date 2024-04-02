/**
 * @author V.C22.3
 * @version 0.1
 */
public class j44_star_patten_reverse_loop {
    public static void main(String[] args) {
        //reverse using for loop
        // for(int i=4;i>0;i--){
        //     for(int j=0;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //using while loop
        // int i=4;
        // int j=0;
        // while(i>0){
        //     while(j<i){
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.println();
        //     i--;
        //     j=0;
        // }
    

        //using do-while loop
        int i=4;
        int j=0;
        do{
            do{
                System.out.print("*");
                j++;
            }while(j<i);
            System.out.println();
            i--;
            j=0;
        }while(i>0);
    }
}
