import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j54_aver_3student {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        float[] marksPhysic=new float[3];
        System.out.println("Enter physics subject marks,");
        int j=0;
        float sum=0f;
        for(float i:marksPhysic){
            System.out.print("Enter marks for stuent "+(j+1)+" : ");
            marksPhysic[j]=user.nextFloat();
            sum+=marksPhysic[j];
            j++;
        }
        System.out.printf("Average marks contan by students is : %.2f",(sum/3));
        user.close();
    }
}
