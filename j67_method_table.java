import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j67_method_table {
    // create a table by return an array(try in my way ^_^(sweet smile) )
    static int[] mult(int n){
        int []arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(i+1)*n;
        }
        return arr;
    }
    // normal way 
    static void mult1(int n){
        for (int i = 1; i < 11; i++) {
            System.out.println(n+"\tX\t"+(i)+"\t=\t"+(n*i));
        }
    }
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        System.out.print("Enter a number for create a table : ");
        int num=user.nextInt();
        user.close();
        // myway(means sky way - ajay devgan - AJ )
        System.out.println("table of "+num+" is ,");
        int []arr=mult(num);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(num+"\tX\t"+(i+1)+"\t=\t"+arr[i]);
        }
        // other way
        System.out.println("\ntable of "+(num+1)+" is ,");
        mult1(num+1);
    }
}
