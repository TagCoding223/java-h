/**
 * @author V.C22.3
 * @version 0.1
 */
public class j26_rel_logical_operator {
    public static void main(String[] args) {
        //reational operator
        System.out.println("Is 3 and 5 are equals : "+(3==5));
        System.out.println("Is 3 is greater than 2 : "+(3>2));
        System.out.println("Is 1 is smaller than 10 : "+(1<10));
        System.out.println("Is 3 is greater or equal to 3 : "+(3>=3));
        System.out.println("Is 9 is smaller or equal to 1 : "+(9<=1));
        System.out.println("Is 4 not equal to 4 : "+(4!=45));//try 4!=4

        //logical operator
        boolean a=true;
        boolean b=false;
        //and
        if(a && b){
            System.out.println("Y , means all conditions are ture .");
        }
        else{
            System.out.println("N , means not all conditions are ture");
        }
        //or 
        if(a || b){
            System.out.println("Y , means any one condition are ture .");
        }
        else{
            System.out.println("N , means all conditions are false .");
        }
        //not
        System.out.println("a is ture and its complement is : "+!a);
        System.out.println("b is false and its complement is : "+!b);
    }
}
