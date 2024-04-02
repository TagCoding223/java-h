/**
 * @author V.C22.3
 * @version 0.1
 */
public class j41_odd_even {
    public static void main(String[] args) {
        //even number upto 100
        System.out.println("Even number's upto 100");
        for(int i=1;i<=50;i++){
            // if(i%2==0){
            //     System.out.println(i);
            // }
            System.out.println(i*2);
        }
        
        //odd number upto 100
        System.out.println("Odd number's upto 100");
        for(int i=0;i<=100;i++){
            if(i%2!=0){
                System.out.println(i);
            }
            //System.out.println(i*2+1);
        }


    }
}
