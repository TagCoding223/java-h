package javadoctest;
import java.util.Scanner;
// javadoc
// class tags
/**
 * your custom exception class creation 
 * @author V.C22.3
 * @version 0.1
 * @since 19/08/2023
 * @see <a herf="google.com">Internet Referance</a>
 */

class InvalidInput extends Exception{
    /**
     * This is tostring method run when a and b is zero 
     * @author V.C22.3
     * @version 0.1
     * @since 19/08/2023
     * @see <a herf="google.com">Internet Referance</a>
     * @param toString() does not take any parameters
     * @return It will return a string .
     * @throws toString() use to throw invalid input exception
     */
    //@deprecated deprection status
    public String toString(){
        return "cannot perform operation on zero's , becuase it does not create scnce ! ";
    }
}
class notDivideZero extends Exception{
    public String toString(){
        return "cannot divide by 0 , becuase it is a arithmatic exception ! ";
    }
}
class maxIn extends Exception{
    public String toString(){
        return "Value is out of bound of 1000 ! ";
    }
}
class multiplicationOutofBound extends Exception{
    public String toString(){
        return "After multiplication result is out of 10000 !";
    }
}
class subNegative extends Exception{
    public String toString(){
        return "After substraction result is negative !";
    }
}
class cal{
    double x,y;
    public double add() throws InvalidInput{
        if(x==0 && x==0){
            throw new InvalidInput();
            //{ you should make it sance
                // try{
                //     throw new InvalidInput();
                // }
                // finally{
                //     System.out.println("Result is below ,");
                // }
            //}
        }
        return x+y;
    }
    /**
     * This is a substraction method run when we want a - b  .
     * @author V.C22.3
     * @version 0.1
     * @since 19/08/2023
     * @see <a herf="google.com" target="block">Internet Referance</a>
     * @param (x-y) return by sub() method .
     * @return It will return a-b .
     * @throws toString() throw subNegative exception
     */
    // @deprecated deprection status
    public double sub() throws subNegative{
        if((x-y)<+(-1)){
            throw new subNegative();
        }
        return x-y;
    }
    public double divison() throws notDivideZero{
        if(y==0){
            throw new notDivideZero();
        }
        return x/y;
    }
    public double mult() throws multiplicationOutofBound{
        if((x*y)>=10000){
            throw new multiplicationOutofBound();
        }
        return x*y;
    }
    Scanner user=new Scanner(System.in);
    public cal() throws maxIn{
        System.out.print("Enter a : ");
        this.x = user.nextDouble();
        System.out.print("Enter b : ");
        this.y = user.nextDouble();
        if(x>=1000 || y>=1000){
            throw new maxIn();
        }
    }
}
public class j128_cal_exception {
    public static void main(String[] args) throws Exception{
        cal objCal=new cal();
        System.out.println("Sum is : "+objCal.add());
        System.out.println("substraction is : "+objCal.sub());
        System.out.println("Multiplication is : "+objCal.mult());
        System.out.println("Divison is : "+objCal.divison());
    }
}
