import java.util.Scanner;

public class operation{
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        String name;
        System.out.println("Enter your name : ");
        name=user.next();
        System.out.println("Hello "+name+" , i am vishal .");
        user.close();
    }
}