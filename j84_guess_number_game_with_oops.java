/** 
 * @Title guess number game with class
 * @author V.C22.3
 * @version 0.1
 */
class game{
    int randomNumber;
    int userNumber;
    int count=0;
    java.util.Scanner user=new java.util.Scanner(System.in); // if we incorot this in userinput method and also use user.close() , then it will throw run time error
    game(){
        java.util.Random random=new java.util.Random();
        randomNumber=random.nextInt(100);
    }
    void userInput(){
        System.out.print("Guess a number : ");
        userNumber=user.nextInt();
        count++;
        isCorrectNumber();
    }
    void isCorrectNumber(){
        if(userNumber==randomNumber){
            System.out.println("Your guess is correct , number is : "+randomNumber+" and you guess in "+count+" time.");
        }
        else if(userNumber<randomNumber){
            System.out.println("Your number is small , guess same high !");
            userInput();
        }
        else if(userNumber>randomNumber){
            System.out.println("Your number is grater , guess same smaller !");
            userInput();
        }
        else{
            System.out.println("erroe : given input is not valid!");
        }
    }
}
public class j84_guess_number_game_with_oops {
    public static void main(String[] args) {
        game obj=new game();
        obj.userInput();
    }
}
