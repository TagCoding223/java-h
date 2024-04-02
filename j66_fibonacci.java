import java.util.Scanner;

/**
 * @author V.C22.3
 * @version 0.1
 */
public class j66_fibonacci {

    //complex code for fibonacci sereis for higest accuresy and use array as parameter and saving the values
    static void arrFibo(int runSize,int []aeArr){
        // int []aeArr=new int[((runSize/2)/2)];
        aeArr[0]=0;
        aeArr[1]=1;
        // boolean check=((aeArr[0]+aeArr[1])<runSize);
        // System.out.println(aeArr[0]+"\t"+runSize+"\t"+check);
        for (int i = 2;((aeArr[i-2]+aeArr[i-1])<runSize); i++) {
            // check=((aeArr[i]+aeArr[i-1])<runSize);
            // System.out.println((aeArr[i]+aeArr[i-1])+"\t"+runSize+"\t"+check);
            
            aeArr[i]=aeArr[i-2]+aeArr[i-1];
            if(((aeArr[i]+aeArr[i-1])>runSize)==true){
                aeArr[i+1]=-1;
                break;
            }
        }
    }

    // simple code for fibonacci sereis
    static void arrFibo1(int limit){
        int i=0;
        for (int j = 1; i <= limit;) {//for sntax without update value
            System.out.println(i);
            if(j<=limit){
                System.out.println(j);
            }
            i=i+j;
            j=i+j;
        }
    }
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        System.out.print("Enter a limit fo fibonacci series : ");
        int limit=user.nextInt();
        user.close();
        int []arr=new int[((limit/2)/2)];
        arrFibo(limit,arr);
        System.out.println("Fibonacci with complex algorithm,");
        for (int i : arr) {
            if(i==-1){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Fibonacci with simple algorithm,");
        arrFibo1(limit);
    }
}
