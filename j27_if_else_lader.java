import java.util.Scanner;
/**
 * @author V.C22.3
 * @version 0.1
 */
public class j27_if_else_lader {
    public static void main(String[] args) {
    //if_else leder
    Scanner user=new Scanner(System.in);
    int age;
    System.out.print("Enter your age : ");
    age=user.nextInt();
    //Note : in if-else lader only one statement should be run , if you change codition one to condition two then you ovegve all smaller number upto 25 run statement 1 statement2 never run, because lader just execute only one statement at lader 
    /*if(age<25){try age>18 && age<25
        System.out.println("your are a kid , you should complete study.");
    }
    else if(age<18){
        System.out.println("Your are completely adult , you should join a job .");
    }*/
    if(age<18){
        System.out.println("your are a kid , you should complete study.");
    }
    else if(age<25){
        System.out.println("Your are completely adult , you should join a job .");
    }
    else if(age<29){
        System.out.println("You are expersion person on your work .");
    }
    else{
        System.out.println("I have not any idea for you .");
    }
    user.close();
    }
}
