import java.util.Scanner;

/**
 * @author V.C22.3
 * @version 0.1
 */
// Introduction of Methods in other class

class demoMethod{
    public Scanner user=new Scanner(System.in);
    // without return and argument
    public void hello() {
        System.out.println("Hello guys , i am vishal .");
    }

    // without argument but with return
    public int sum(){
        System.out.println("Sum method called,");
        System.out.print("Enter value of a : ");
        int a=user.nextInt();
        System.out.print("Enter value of b : ");
        int b=user.nextInt();
        return a+b;
    }

    //without return but with return
    public void multi(int a,int b){//parameters
        System.out.println("Solution of "+a+"X"+b+" is : "+(a*b));
    }

    //with return & return
    int divi(int a,int b){ //defualt method of different class allow to access in another class
        return a/b;
    }
}
public class j59_method_intro_other_class {
    public static void main(String[] args) {
        demoMethod obj=new demoMethod();
        obj.hello();
        int a=obj.sum();
        System.out.println("Sum of a & b is : "+a);
        obj.multi(a,2); //argument
        System.out.println("Solution of "+a+"/"+2+" is : "+obj.divi(a,2));
    }
}
