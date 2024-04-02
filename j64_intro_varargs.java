/**
 * @author V.C22.3
 * @version 0.1
 */
public class j64_intro_varargs {
    static int arrMethod(int ...arrReferance) {
        //here arrReferance is an array means int [] arrReferance
        int result=0;
        for (int j = 0; j < arrReferance.length; j++) {
            result=result+arrReferance[j];
        }
        return result;
    }
    static void arrMethod(String text,int ...arrReferance) {
        System.out.println("\n"+text+" opertion occur ,");
        int result=0;
        for (int j = 0; j < arrReferance.length; j++) {
            result=result+arrReferance[j];
        }
        System.out.print("sum of given numbers is : "+result); 
    }

    // error case of varargs
    // static void sum(String ...intValue,float ...floatValue,int k){

    // }
    // static void sum(int j,String ...intValue,float ...floatValue){

    //  }
    // static void sum(String ...intValue,float ...floatValue){

    // } // thats not allow becuase varargs variable declare at last and only one
    public static void main(String[] args) {
        //System.out.println("I am pass nothing : "+arrMethod(null));//throw run time error thread becuase at least one argument pass 

        // only vararges parameter method
        System.out.println("Sum of 2 is : "+arrMethod(2));
        System.out.println("Sum of 2+3 is : "+arrMethod(2,3));
        System.out.println("Sum of 2+3+4 is : "+arrMethod(2,3,4));
        System.out.println("Sum of 2+3+4+5 is : "+arrMethod(2,3,4,5));
        System.out.println("Sum of 2+3+4+5+6 is : "+arrMethod(2,3,4,5,6));

        // a comersely variable need method
        //arrMethod(null, null);error
        arrMethod(null, 2);
        //arrMethod("Sum", null);error
        arrMethod("Sum", 2);
        arrMethod("Sum", 2,3);
        arrMethod("Sum", 2,3,4);
        arrMethod("Sum", 2,3,4,5);

        
        //sum("arr",3,4, 35.f);not allow because java not desaet which variable belong to which parameters
    }
}
