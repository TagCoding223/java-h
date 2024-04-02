import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j31_3sub_eachminim_avgofeach {
    public static void main(String[] args) {
        // three subject average & each subject minimum marks calcuation
        Scanner user=new Scanner(System.in);
        float a,b,c;
        System.out.print("Enter marks for subject 1 : ");
        a=user.nextFloat();
        System.out.print("Enter marks for subject 2 : ");
        b=user.nextFloat();
        System.out.print("Enter marks for subject 3 : ");
        c=user.nextFloat();
        float avg=(a+b+c)/3;
        System.out.println("Your average is : "+avg);
        if(avg>=40 && a>=33 && b>=33 && c>=33){
            System.out.println("You are ready to join new class .");
        }
        else{
            System.out.println("Sorry you are not ready to join new class.");
        }
        user.close();
    }
}
