import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j28_switch_intro {
    public static void main(String[] args) {
        // swtich case
        Scanner user = new Scanner(System.in);
        System.out.print("Rate for Service(1-5) : ");
        int rate = user.nextInt();
        switch (rate) {
            case 1:
                System.out.println("very very low.");
                break;
            case 2:
                System.out.println("very low.");
                break;
            case 3:
                System.out.println("best.");
                break;
            case 4:
                System.out.println("Most Best.");
                break;
            case 5:
                System.out.println("Very Nice.");
                break;
            default:
                System.out.println("Your rating is outstanding.");
        }
        
        //taking a character in java without have any nextChar() support
        System.out.print("Enter a character(A-D in capetel letter) : ");
        char ch = user.next().charAt(0);
        
        //inhance switch
        switch(ch){
            case 'A'->{
                System.out.printf("You will type this A ");
                System.out.println("\ntry to print more");
            }
            case 'B'->System.out.printf("You will type this B ");
            case 'C'->System.out.printf("You will type this C ");
            case 'D'->System.out.printf("You will type this D ");
            default ->System.out.println("Your given character is out of my limit(range)");
        }
        user.close();
    }
}
