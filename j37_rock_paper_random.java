import java.util.Random;
import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j37_rock_paper_random {
    static public void myError(){
        System.out.println("Given input is not valid !");
    }
    public static void main(String[] args) {
        /*0->Rock
         1->Paper
         2->seger
         */
        Random random =new Random();
        Scanner user =new Scanner(System.in);
        int com=random.nextInt(3);
        
        System.out.print("Enter your choice (0->Rock , 1->Paper , 2->Seger ) : ");
        int userChoice=user.nextInt();
        
        if(userChoice!=0 && userChoice!=1 && userChoice!=2  ){
            myError();
        }
        else if((com==2 && userChoice==0) || (com==0 && userChoice==1) ||(com==1 && userChoice==2)){
            System.out.println("You won !");
        }
        else if(com==userChoice){
            System.out.println("Game is Draw");
        }
        else{
            System.out.println("computer won !");
        }

        if(com==0){
            System.out.println("computer choice is : Rock");
        }
        else if(com==1){
            System.out.println("computer choice is : Paper"); 
        }
        else{
            System.out.println("computer choice is : Seger");
        }
        user.close();
    }
}
