/**
 * @author V.C22.3
 * @version 0.1
 */
public class j34_day_switch {
    public static void main(String[] args) {
        java.util.Scanner user=new java.util.Scanner(System.in);
        int choice;
        System.out.print("Enter your choice 1 to 7 to display day : ");
        choice=user.nextInt();
        switch(choice){
            case 1->System.out.println("Today is Monday");
            case 2->System.out.println("Today is Tuesday");
            case 3->System.out.println("Today is Webnesday");
            case 4->System.out.println("Today is Thursday");
            case 5->System.out.println("Today is Friday");
            case 6->System.out.println("Today is Saturday");
            case 7->System.out.println("Today is Sunday");
            default->System.out.println("Your given input not exsit on range !");
        }
        user.close();
    }
}
