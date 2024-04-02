/**
 * @author V.C22.3
 * @version 0.1
 */
public class j38_intro_loop {
    public static void main(String[] args) {
        // do while loop
        int i=0;
        do{
            System.out.print("Value of i is : "+i);
            System.out.println();
            //i++;
        }while(i!=0 && i<5);

        boolean flag=true;
        //while loop
        //while(i<5){
        //while(true){
        //while(0){->error not accept in java , but accept in c /c++
        while(flag){
            System.out.print("Value of i is : "+i);
            System.out.println();
            i++;
            if(i==5){
                flag=false;
            }
        }

        //for loop
        for(i=4;i>=0;i--){
            System.out.print("Value of i is : "+i);
            System.out.println();
        }
    }
}
