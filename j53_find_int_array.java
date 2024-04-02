import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j53_find_int_array {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int [] arr={6,9,0,4,2,5,3,7,8,1};
        System.out.print("Enter a number under 0 to 9 : ");
        int no=user.nextInt();
        int j=-1;
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==no){
                flag =true;
                j=i;
                break;
            }
        }
        if(flag==true){
            System.out.println("Given value present at index "+j+" and value position is : "+(j+1));
        }
        else{
            System.out.println("Given value not present around 0 to 9.");
        }
        user.close();
    }
}
