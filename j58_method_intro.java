import java.util.Scanner;

/**
 * @author V.C22.3
 * @version 0.1
 */
// Introduction of Methods
    
public class j58_method_intro {
    static Scanner user=new Scanner(System.in); // we incrooet scanner object here because i want use this object for every method of this class (try to comment it , you offserive error at line no. 20 and 22 )

    // without return and argument
    static void hello() {
        System.out.println("Hello guys , i am vishal .");
    }

    // without argument but with return
    static int sum(){
        System.out.println("Sum method called,");
        System.out.print("Enter value of a : ");
        int a=user.nextInt();
        System.out.print("Enter value of b : ");
        int b=user.nextInt();
        return a+b;
    }

    //without return but with return
    static void multi(int a,int b){//parameters
        System.out.println("Solution of "+a+"X"+b+" is : "+(a*b));
    }
    //with return & return
    static int divi(int a,int b){
        System.out.println("Divison performet ,");
        return a/b;
    }
    public static void main(String[] args) {
        hello();
        int a=sum();
        System.out.println("Sum of a & b is : "+a);
        multi(a,2); //argument
        System.out.println("Solution of "+a+"/"+2+" is : "+divi(a, 2));
    }
}
// we incrrot ststic keyword in each method because main method is a static method & if method present in same class , then we say that a static method call only a static method (try to remove static keyword ) note for you : resarch on this topic and find a way to use method of prime class without static keyword 
// when we pass arguments in parameters then a copy send to parameters(method)