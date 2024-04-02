import java.util.Scanner;
/**
 * @Title error q2_q3
 * @author V.C22.3
 * @version 0.1
 */
class last extends ArrayIndexOutOfBoundsException{
    public String getMessage(){
        return "Error : Array index out of bound !";
    }
}
public class j127_error_q2_and_q3 {
    public static void main(String[] args) throws last{
        boolean flag=true;
        int [] arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        Scanner user=new Scanner(System.in);
        int index , i=0;
        while (flag && i<5) {
            try {
                System.out.print("Enter arr index : ");
                index=user.nextInt();
                System.out.println("Value at given index : "+arr[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                if(i==4){
                    System.out.println("Your lose all chance !");
                    i++;
                    break;
                }
                else if(i>=5){
                    break;
                }
                else{
                System.out.println("Re-try , because : "+e+" occur !");
                i++;
                }
            }
        }
        user.close();
        try{
            if(i>=5){
            //System.out.println("Error : Array index out of bound !");
                throw new last();
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
